package com.swrve.sdk.messaging.model;

import YU.a;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.messaging.model.Conditions;
import java.util.List;

/* loaded from: classes6.dex */
public class Trigger {
    private Conditions conditions;
    private String eventName;

    public static List<Trigger> fromJson(String str, int i) {
        List<Trigger> list;
        JsonParseException e;
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.c = FieldNamingPolicy.e;
            list = (List) gsonBuilder.a().f(str, new TypeToken<List<Trigger>>() { // from class: com.swrve.sdk.messaging.model.Trigger.1
            }.getType());
        } catch (JsonParseException e2) {
            list = null;
            e = e2;
        }
        try {
            return validateTriggers(list, i);
        } catch (JsonParseException e3) {
            e = e3;
            SwrveLogger.c(a.A("Could not parse campaign[%s] trigger json:%s", str), e, Integer.valueOf(i), str);
            return list;
        }
    }

    private static List<Trigger> validateTriggers(List<Trigger> list, int i) {
        for (Trigger trigger : list) {
            Conditions conditions = trigger.getConditions();
            if (conditions == null) {
                SwrveLogger.d("Invalid trigger in campaign[%s] trigger:%s", Integer.valueOf(i), trigger);
                return null;
            }
            if (conditions.getOp() != null || conditions.getValue() != null || conditions.getKey() != null || conditions.getArgs() != null) {
                if (Conditions.Op.AND.equals(conditions.getOp()) || Conditions.Op.OR.equals(conditions.getOp())) {
                    if (conditions.getArgs() == null || conditions.getArgs().size() == 0) {
                        SwrveLogger.d("Invalid trigger in campaign[%s] trigger:%s", Integer.valueOf(i), trigger);
                        return null;
                    }
                    for (Arg arg : conditions.getArgs()) {
                        if (arg.getKey() == null || arg.getOp() == null || arg.getValue() == null) {
                            SwrveLogger.d("Invalid trigger in campaign[%s] trigger:%s", Integer.valueOf(i), trigger);
                            return null;
                        }
                    }
                } else {
                    if (!Conditions.Op.NUMBER_BETWEEN.equals(conditions.getOp()) && !Conditions.Op.NUMBER_EQ.equals(conditions.getOp()) && !Conditions.Op.NUMBER_LT.equals(conditions.getOp()) && !Conditions.Op.NUMBER_NOT_BETWEEN.equals(conditions.getOp()) && !Conditions.Op.NUMBER_GT.equals(conditions.getOp()) && !Conditions.Op.EQ.equals(conditions.getOp()) && !Conditions.Op.CONTAINS.equals(conditions.getOp())) {
                        SwrveLogger.d("Invalid trigger in campaign[%s] trigger:%s", Integer.valueOf(i), trigger);
                        return null;
                    }
                    if (conditions.getKey() == null || conditions.getValue() == null) {
                        SwrveLogger.d("Invalid trigger in campaign[%s] trigger:%s", Integer.valueOf(i), trigger);
                        return null;
                    }
                }
            }
        }
        return list;
    }

    public Conditions getConditions() {
        return this.conditions;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String toString() {
        return "Trigger{eventName='" + this.eventName + "', conditions=" + this.conditions + '}';
    }
}
