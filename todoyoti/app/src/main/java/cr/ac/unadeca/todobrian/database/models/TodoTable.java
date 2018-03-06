package cr.ac.unadeca.todobrian.database.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import cr.ac.unadeca.todobrian.database.TodoDatabase;

/**
 * Created by Brian on 2/5/18.
 */

@Table(database = TodoDatabase.class)
public class TodoTable extends BaseModel {
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String nombre;

    @Column
    public String actividad;

    @Column

    public int estado;
}
