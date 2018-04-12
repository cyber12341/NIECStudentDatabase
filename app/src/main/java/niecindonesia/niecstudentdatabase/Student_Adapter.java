package niecindonesia.niecstudentdatabase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 12/04/2018.
 */

public class Student_Adapter extends RecyclerView.Adapter<Student_Adapter.ViewHolder> {

    private Context context;
    private List<Student_Data> list;

    public Student_Adapter (Context context, List<Student_Data> list)
    {
        this.context = context;
        this.list = list;
    }

    @Override
    public Student_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.single_cardview_student,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Student_Adapter.ViewHolder holder, int position) {
        Student_Data student_data = list.get(position);
        holder.nama.setText(student_data.getNama_student());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nama;

        public ViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.txtNama);
        }
    }
}
