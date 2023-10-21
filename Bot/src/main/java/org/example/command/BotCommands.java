package org.example.command;

public class BotCommands {
    @AppBotCommand(name = "/hello", description = "приветствие")
    String hello() {
        return "Привет";
    }

    @AppBotCommand(name = "/bye", description = "прощание")
    String bye() {
        return "Пока!";

    }

    @AppBotCommand(name = "/help", description = "ПОМОГИТЕ!")
    String help() {
        return "ПОМОГИТЕ!";
    }
}
