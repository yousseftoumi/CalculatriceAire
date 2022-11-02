import java.util.List;

public class CalculatriceAire {
    public static double aire(List<IForme> formes){
        double aire = 0;
        for( IForme forme : formes){
            aire+=forme.aire();
        }
        return aire;
    }
}
