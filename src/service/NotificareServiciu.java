package service;

import Model.*;

public class NotificareServiciu
{
    public void trimiteNotificare(Notificare notificare)
    {
        System.out.println("Notificarea: ,," + notificare.getMesaj() + "'' a fost trimisa cu succes!");
    }
}
