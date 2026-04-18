package practice.java8features.steamAPI;

class EmployeeDTO {
    private int id;
    private String name;

    public EmployeeDTO(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
