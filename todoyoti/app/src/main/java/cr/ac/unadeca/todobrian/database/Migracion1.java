package cr.ac.unadeca.todobrian.database;

import com.raizlabs.android.dbflow.annotation.Migration;
import com.raizlabs.android.dbflow.sql.SQLiteType;
import com.raizlabs.android.dbflow.sql.migration.AlterTableMigration;

import cr.ac.unadeca.todobrian.database.models.TodoTable;

/**
 * Created by Yoti on 26/2/2018.
 */
@Migration(version = 3, database = TodoDatabase.class)
public class Migracion1 extends AlterTableMigration<TodoTable>{


    public Migracion1(Class<TodoTable> table){
        super(table);
    }

    @Override
    public void onPostMigrate() {
        super.onPostMigrate();
        addColumn(SQLiteType.INTEGER, "estado");
    }
}
