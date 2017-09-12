class CreateNews < ActiveRecord::Migration[5.1]
  def change
    create_table :news do |t|
      t.string :title
      t.string :body
      t.string :author
      t.string :coverimage

      t.timestamps
    end
  end
end
