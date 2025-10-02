package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes.dex */
class m3 implements n3 {
    @Override // com.medallia.digital.mobilesdk.n3
    public boolean a() {
        boolean zA = d7.b().a(d7.a.IS_SDK_KILLED, false);
        boolean zA2 = d7.b().a(d7.a.SHOULD_CHECK_OS, false);
        long jA = d7.b().a(d7.a.SDK_RECOVER_TIMESTAMP, 0L);
        if (zA) {
            if (r6.b()) {
                return true;
            }
            if (zA2 && r6.a()) {
                return true;
            }
            if (jA != -1 && c() >= jA) {
                return true;
            }
        }
        return false;
    }

    @Override // com.medallia.digital.mobilesdk.n3
    public void b(KillStatus killStatus) {
        if (killStatus == null || !killStatus.isKilled().booleanValue()) {
            return;
        }
        d7.b().b(d7.a.SDK_KILL_TIMESTAMP, System.currentTimeMillis());
        if (killStatus.getShouldCheckRestoreOnOsChange() != null) {
            d7.b().b(d7.a.SHOULD_CHECK_OS, killStatus.getShouldCheckRestoreOnOsChange().booleanValue());
        }
        if (killStatus.getRestorePollingInterval() != null) {
            if (killStatus.getRestorePollingInterval().longValue() == -1) {
                d7.b().b(d7.a.SDK_RECOVER_TIMESTAMP, killStatus.getRestorePollingInterval().longValue());
            } else {
                d7.b().b(d7.a.SDK_RECOVER_TIMESTAMP, killStatus.getRestorePollingInterval().longValue() + System.currentTimeMillis());
            }
        }
        if (killStatus.isKilled() != null) {
            d7.b().b(d7.a.IS_SDK_KILLED, killStatus.isKilled().booleanValue());
        }
    }

    public long c() {
        return System.currentTimeMillis();
    }

    @Override // com.medallia.digital.mobilesdk.n3
    public void clear() {
        d7.b().b(d7.a.IS_SDK_KILLED, false);
        d7.b().b(d7.a.SDK_RECOVER_TIMESTAMP, 0L);
        d7.b().b(d7.a.SDK_KILL_TIMESTAMP, 0L);
    }

    @Override // com.medallia.digital.mobilesdk.n3
    public boolean a(KillStatus killStatus) {
        return (killStatus == null || killStatus.isKilled() == null || !killStatus.isKilled().booleanValue()) ? false : true;
    }

    @Override // com.medallia.digital.mobilesdk.n3
    public boolean b() {
        return d7.b().a(d7.a.IS_SDK_KILLED, false);
    }

    @Override // com.medallia.digital.mobilesdk.n3
    public boolean c(KillStatus killStatus) {
        return !a(killStatus) && b();
    }
}
