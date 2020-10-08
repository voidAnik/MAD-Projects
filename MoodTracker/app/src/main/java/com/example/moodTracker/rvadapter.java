package com.example.moodTracker;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class rvadapter extends RecyclerView.Adapter<rvadapter.myviewholder> {

    private Context mCtx;
    private List<model> quesList;

    public rvadapter(Context mCtx, List<model> quesList) {
        this.mCtx = mCtx;
        this.quesList = quesList;
    }

    @NonNull

    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.single_view,parent,false);
        return new myviewholder(view);
    }


    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        model model = quesList.get(position);

        holder.tv_ques1.setText(model.q1);
        if (TextUtils.isEmpty(holder.tv_ques1.getText().toString()))
            holder.tv_ques1.setVisibility(View.GONE);
        else
            holder.tv_ques1.setVisibility(View.VISIBLE);

        holder.tv_ques2.setText(model.q2);
        if (TextUtils.isEmpty(holder.tv_ques2.getText().toString()))
            holder.tv_ques2.setVisibility(View.GONE);
        else
            holder.tv_ques2.setVisibility(View.VISIBLE);

        holder.tv_ques3.setText(model.q3);
        if (TextUtils.isEmpty(holder.tv_ques3.getText().toString()))
            holder.tv_ques3.setVisibility(View.GONE);
        else
            holder.tv_ques3.setVisibility(View.VISIBLE);

        holder.tv_reply.setText(model.id);
        if (TextUtils.isEmpty(holder.tv_reply.getText().toString()))
            holder.tv_reply.setVisibility(View.GONE);
        else
            holder.tv_reply.setVisibility(View.VISIBLE);

        holder.btn_ans1.setText(model.btn_ans1);
        if (TextUtils.isEmpty(holder.btn_ans1.getText().toString()))
           holder.btn_ans1.setVisibility(View.GONE);
        else
            holder.btn_ans1.setVisibility(View.VISIBLE);

        holder.btn_ans2.setText(model.btn_ans2);
        if (TextUtils.isEmpty(holder.btn_ans2.getText().toString()))
            holder.btn_ans2.setVisibility(View.GONE);
        else
            holder.btn_ans2.setVisibility(View.VISIBLE);

        holder.btn_ans3.setText(model.btn_ans3);
        if (TextUtils.isEmpty(holder.btn_ans3.getText().toString()))
            holder.btn_ans3.setVisibility(View.GONE);
        else
            holder.btn_ans3.setVisibility(View.VISIBLE);

        holder.btn_ans4.setText(model.btn_ans4);
        if (TextUtils.isEmpty(holder.btn_ans4.getText().toString()))
            holder.btn_ans4.setVisibility(View.GONE);
        else
            holder.btn_ans4.setVisibility(View.VISIBLE);

        holder.btn_txt.setText(model.btn_txt);
        if (TextUtils.isEmpty(holder.btn_txt.getText().toString()))
            holder.btn_txt.setVisibility(View.GONE);
        else
            holder.btn_txt.setVisibility(View.VISIBLE);


    }

    @Override
    public int getItemCount() {
        return quesList.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        TextView tv_ques1, tv_ques2, tv_ques3, tv_reply;
        TextView btn_txt, btn_ans1, btn_ans2, btn_ans3, btn_ans4;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            tv_ques1 = itemView.findViewById(R.id.tv_ques1);
            tv_ques2 = itemView.findViewById(R.id.tv_ques2);
            tv_ques3 = itemView.findViewById(R.id.tv_ques3);
            tv_reply = itemView.findViewById(R.id.tv_reply);
            btn_txt = itemView.findViewById(R.id.btn_txt);
            btn_ans1 = itemView.findViewById(R.id.btn_ans1);
            btn_ans2 = itemView.findViewById(R.id.btn_ans2);
            btn_ans3 = itemView.findViewById(R.id.btn_ans3);
            btn_ans4 = itemView.findViewById(R.id.btn_ans4);
        }
    }
}
