package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SharingCommand {
    public static final SharingCommand d;
    public static final SharingCommand e;
    public static final SharingCommand f;
    public static final /* synthetic */ SharingCommand[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        SharingCommand sharingCommand = new SharingCommand("START", 0);
        d = sharingCommand;
        SharingCommand sharingCommand2 = new SharingCommand("STOP", 1);
        e = sharingCommand2;
        SharingCommand sharingCommand3 = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        f = sharingCommand3;
        SharingCommand[] sharingCommandArr = {sharingCommand, sharingCommand2, sharingCommand3};
        g = sharingCommandArr;
        h = EnumEntriesKt.a(sharingCommandArr);
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) g.clone();
    }
}
