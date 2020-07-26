public class BonusMilesService {
    public int calculate(int cost){
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonus = 20;
        int miles = price/bonus;
        return miles;
    }
}
