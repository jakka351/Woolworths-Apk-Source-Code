package io.github.aakira.napier;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/github/aakira/napier/Napier;", "", "Level", "napier_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class Napier {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/github/aakira/napier/Napier$Level;", "", "napier_release"}, k = 1, mv = {1, 4, 2})
    public static final class Level {
        public static final /* synthetic */ Level[] d = {new Level("VERBOSE", 0), new Level("DEBUG", 1), new Level("INFO", 2), new Level("WARNING", 3), new Level("ERROR", 4), new Level("ASSERT", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Level EF5;

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) d.clone();
        }
    }

    static {
        new ArrayList();
    }
}
