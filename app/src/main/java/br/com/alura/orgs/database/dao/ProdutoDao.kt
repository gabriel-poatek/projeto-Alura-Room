package br.com.alura.orgs.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import br.com.alura.orgs.model.Produto

@Dao
interface ProdutoDao {

    @Query(value = "SELECT * FROM Produto")
    fun buscaTodos() : List<Produto>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun salva(produto: Produto)

    @Delete
    fun deleta(produto: Produto)


    @Query(value = "SELECT * FROM Produto WHERE id = :id")
    fun buscaPorId(id: Long) : Produto?

}