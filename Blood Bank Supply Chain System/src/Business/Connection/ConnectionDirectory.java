/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Connection;

import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class ConnectionDirectory {
    
    private ArrayList<Connection> connectionDirectory;

    public ConnectionDirectory() {
        connectionDirectory = new ArrayList<Connection>();
    }
    
    public ArrayList<Connection> getConnectionDirectory() {
        return connectionDirectory;
    }

    public void setConnectionDirectory(ArrayList<Connection> connectionDirectory) {
        this.connectionDirectory = connectionDirectory;
    }
    
    public Connection addConnection()
    {
        Connection connection = new Connection();
        connectionDirectory.add(connection);
        return connection;
    }
    
    public void updateConnection(String firstUserEmailId, String secondUserEmailId, String status)
    {
        for(Connection connection : connectionDirectory)
        {
            if(connection.getSenderUser().getEmailId().equals(firstUserEmailId) || connection.getRecieverUser().getEmailId().equals(secondUserEmailId))
            {
                connection.setStatus(status);
            }
        }
    }
}
