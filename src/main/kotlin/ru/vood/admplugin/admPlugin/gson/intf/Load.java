package ru.vood.admplugin.admPlugin.gson.intf;

import ru.vood.admplugin.admPlugin.spring.entity.ParentForAll;

import java.io.File;
import java.util.ArrayList;

public interface Load<E extends ParentForAll> {

    ArrayList<E> loadFrom(File file);

}
