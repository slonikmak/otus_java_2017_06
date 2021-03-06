package ru.otus.l71.behavioral.visitor.good.services;

import ru.otus.l71.behavioral.visitor.good.Service;
import ru.otus.l71.behavioral.visitor.good.elements.Body;
import ru.otus.l71.behavioral.visitor.good.elements.Engine;
import ru.otus.l71.behavioral.visitor.good.elements.Wheel;

/**
 * Created by tully.
 */
public class CarRepairService implements Service {
    @Override
    public void visit(Wheel element) {
        System.out.println("Repairing: " + element.getName());
    }

    @Override
    public void visit(Engine element) {
        System.out.println("Repairing: " + element.getName());
    }

    @Override
    public void visit(Body element) {
        System.out.println("Repairing: " + element.getName());
    }
}
