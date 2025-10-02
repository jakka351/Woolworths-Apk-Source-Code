package com.lexisnexisrisk.threatmetrix.rl.tmxbhs;

import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class xxxlxlx {
    public static int f00660066006600660066f = 2;
    public static int f0066f006600660066f = 68;
    public static int f0066ffff0066 = 0;
    public static int ff0066006600660066f = 1;
    private static final SecureRandom q00710071q007100710071;
    private static AtomicBoolean qq0071q007100710071;

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if ((ffffff0066() * (ffffff0066() + ff0066006600660066f)) % f00660066006600660066f != f0066ffff0066) {
            f0066f006600660066f = 75;
            f0066ffff0066 = ffffff0066();
        }
        qq0071q007100710071 = atomicBoolean;
        q00710071q007100710071 = new SecureRandom();
    }

    private xxxlxlx() {
    }

    public static void dbAction() {
        qq0071q007100710071.set(true);
        int i = f0066f006600660066f;
        if (((ff0066006600660066f + i) * i) % f00660066006600660066f != 0) {
            f0066f006600660066f = ffffff0066();
            ff0066006600660066f = 27;
        }
    }

    public static int ffffff0066() {
        return 75;
    }

    public static Long tt00740074tt0074(int i) {
        long j;
        long jNextLong = q00710071q007100710071.nextLong();
        if (qq0071q007100710071.get()) {
            j = jNextLong | 2199023255552L;
            int i2 = f0066f006600660066f;
            if (((ff0066006600660066f + i2) * i2) % f00660066006600660066f != 0) {
                f0066f006600660066f = 28;
                ff0066006600660066f = ffffff0066();
            }
        } else {
            j = jNextLong & (-2199023255553L);
        }
        return Long.valueOf(Long.valueOf(j).longValue() & (-1048577) & (~(1 << i)));
    }
}
