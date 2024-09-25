package com.example.alunoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alunoapp.R

class AlunoAdapter(private val alunos: MutableList<Aluno>) : RecyclerView.Adapter<AlunoAdapter.AlunoViewHolder>() {

    class AlunoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nomeTextView: TextView = itemView.findViewById(R.id.nomeTextView)
        val areaTextView: TextView = itemView.findViewById(R.id.areaTextView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_aluno, parent, false)
        return AlunoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val aluno = alunos[position]
        holder.nomeTextView.text = aluno.nome
        holder.areaTextView.text = aluno.area


    }

    override fun getItemCount(): Int {
        return alunos.size
    }
}