package Part_2.Task_2;

public class LargeClass {
    private Person person;
    private FriendsList friends;
    private EnemiesList enemies;
    private TasksList tasks;

    public LargeClass(Person person){
        this.person = person;
        this.friends = new FriendsList();
        this.enemies = new EnemiesList();
        this.tasks = new TasksList();
    }

    public void displayInfo() {
        System.out.println(person);
        System.out.println("Friends: " + this.friends);
        System.out.println("Enemies: " + this.enemies);
        System.out.println("Tasks: " + this.tasks);
    }
}
