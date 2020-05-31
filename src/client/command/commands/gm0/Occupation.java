package client.command.commands.gm0;

import client.MapleClient;
import client.command.Command;

public class Occupation extends Command {
    {
        setDescription("");
    }

    @Override
    public void execute(MapleClient c, String[] params) {
        c.getPlayer().message("~~ Occupation Information ~~ \r\n Occupation: " + c.getPlayer().getOccupation() + "\r\n Occupation level: " + c.getPlayer().getOccupationLevel());
    }
}