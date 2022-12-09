import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {

    }

    @Override
    public void findall() {

    }

    @Override
    public void delete() {

    }

    String save = "guardado";
    String findall = "buscar todo";
    String delete = "eliminar";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findall='" + findall + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
