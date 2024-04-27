package ch.ksrminecraft.joinleaveplugin.listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class ConnectionListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        // Persönliche Nachricht an den Player senden
        player.sendMessage(Component.text("Willkommen auf dem Server"));

        // Globale Nachricht an alle Spieler senden
        String welcomeMessage = ChatColor.YELLOW + "Der Spieler " + player.getName() + " hat den Server betreten.";
        Bukkit.broadcast(Component.text(welcomeMessage));
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();

        // Globale Nachricht an alle Spieler senden
        String welcomeMessage = ChatColor.YELLOW + "Der Spieler " + player.getName() + " hat den Server verlassen.";
        Bukkit.broadcast(Component.text(welcomeMessage));

    }

}
