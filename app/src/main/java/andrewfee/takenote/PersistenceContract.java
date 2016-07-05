package andrewfee.takenote;

import android.provider.BaseColumns;

//
//Summary: This contract class is a container for constants that define names
//for database tables, columns, etc.
//
public final class PersistenceContract
{
    //private constructor prevents instantiating the contract class
    private PersistenceContract() {}

    //Inner class that defines the database table column names
    public static abstract class NoteEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "note";
        public static final String KEY_TITLE = "title";
        public static final String KEY_TEXT = "text";
        public static final String KEY_DATE = "date";
    }
}
