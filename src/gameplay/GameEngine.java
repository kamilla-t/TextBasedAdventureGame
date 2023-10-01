package gameplay;

public class GameEngine
{
    public static void main(String[] args)
    {
        //read the World object instance from a text file or literal
        World world = ReadWorldDataFile.oneRoomWorld();
        world.mode = World.PlayMode.explore;
        Player playerOne = new Player("Player", "Sir Kendric",100,50);
        world.play(playerOne);
    }

}
