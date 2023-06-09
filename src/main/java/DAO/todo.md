You will need to design and create your own DAO classes from scratch. 
You should refer to prior mini-project lab examples and course material for guidance.

public class SocMediaDAO {
    <!-- /**example DAO from * mini project
    */ -->
    public List<String> getAllGroceries(){
        Connection connection = ConnectionUtil.getConnection();
        List<String> groceries = new ArrayList<>();
        try {
            //Write SQL logic here
            String sql = "SELECT * FROM grocery";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                groceries.add(rs.getString("grocery_name"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return groceries;
    }

    public void addGrocery(String groceryName){
        Connection connection = ConnectionUtil.getConnection();
        try {
            //Write SQL logic here
            String sql = "INSERT INTO grocery (grocery_name) VALUES (?)";
            PreparedStatement ps = connection.prepareStatement(sql);

            //add code that leverages ps.setString here
            ps.setString(1, groceryName);

            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}