package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/DecodeSequenceMode;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes7.dex */
public final class DecodeSequenceMode {
    public static final /* synthetic */ DecodeSequenceMode[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        DecodeSequenceMode[] decodeSequenceModeArr = {new DecodeSequenceMode("WHITESPACE_SEPARATED", 0), new DecodeSequenceMode("ARRAY_WRAPPED", 1), new DecodeSequenceMode("AUTO_DETECT", 2)};
        d = decodeSequenceModeArr;
        e = EnumEntriesKt.a(decodeSequenceModeArr);
    }

    public static DecodeSequenceMode valueOf(String str) {
        return (DecodeSequenceMode) Enum.valueOf(DecodeSequenceMode.class, str);
    }

    public static DecodeSequenceMode[] values() {
        return (DecodeSequenceMode[]) d.clone();
    }
}
