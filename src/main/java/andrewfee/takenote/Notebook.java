package andrewfee.takenote;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.Collections;

//
//Summary: this class represents a collection of Note objects. It uses
//the singleton pattern to guarantee that only one Notebook exists across
//the entire application’s lifecycle.
//
public class Notebook
{
    private Context context;
    private ArrayList<Note> mNotes;
    public ArrayAdapter<Note> noteAdapter;

    private static Notebook mInstance = null;

    //global point of access
    public static synchronized Notebook getInstance(Context context)
    {
        if (mInstance == null){
            mInstance = new Notebook(context);
        }
        return mInstance;
    }

    //constructor
    private Notebook(Context context) {
        this.context = context;
        mNotes = new ArrayList<Note>();
        noteAdapter = new ArrayAdapter<Note>(context, android.R.layout.simple_list_item_1, mNotes);
    }

    public void setNotes(ArrayList<Note> notes)
    {
        mNotes.clear();
        mNotes.addAll(notes);
        Collections.sort(mNotes);
        noteAdapter.notifyDataSetChanged();
    }

    public void addNote(Note note)
    {
        mNotes.add(0, note);
        Collections.sort(mNotes);
        noteAdapter.notifyDataSetChanged();
    }

    public void updateNote(Note note)
    {
        for (int i=0; i<mNotes.size(); i++)
        {
            if (mNotes.get(i).getID() == note.getID()) {
                mNotes.set(i, note);
                Collections.sort(mNotes);
                noteAdapter.notifyDataSetChanged();
                return;
            }
        }
    }

    public void deleteNote(long id)
    {
        for (int i=0; i<mNotes.size(); i++)
        {
            if (mNotes.get(i).getID() == id) {
                mNotes.remove(i);
                Collections.sort(mNotes);
                noteAdapter.notifyDataSetChanged();
                return;
            }
        }
    }

}
