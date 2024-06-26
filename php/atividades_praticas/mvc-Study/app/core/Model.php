<?php


// Main Class da Model
class Model
{

    use Database;
    protected $table = 'users';
    protected $limit = 10;
    protected $offset = 0;
    public function where($data, $data_not=[]){
        
        $keys = array_keys($data);
        $keys_not = array_keys($data_not);
        $query = "select * from $this->table where ";

        foreach($keys as $keys){
            $query .= $keys ." =: ".$keys."&&";
        }

        foreach($keys_not as $keys){
            $query .= $keys ." !=: ".$keys."&&";
        }

        $query = trim($query, "&&");
        
        $query .= " limit $this->limit offset $this->offset";

        $data = array_merge($data, $data_not);
        return $this->query($query, [$data]);
    }
    public function first($data){

    }

    public function insert($data)
    {

    }

    public function update($id,$data, $id_column = 'id' )
    {

    }

    public function delete($id, $id_column = 'id')
    {

    }
}
