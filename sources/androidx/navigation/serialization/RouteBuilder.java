package androidx.navigation.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ParamType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RouteBuilder<T> {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f3514a;
    public final String b;
    public String c = "";
    public String d = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParamType {
        public static final ParamType d;
        public static final ParamType e;
        public static final /* synthetic */ ParamType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            ParamType paramType = new ParamType("PATH", 0);
            d = paramType;
            ParamType paramType2 = new ParamType("QUERY", 1);
            e = paramType2;
            ParamType[] paramTypeArr = {paramType, paramType2};
            f = paramTypeArr;
            g = EnumEntriesKt.a(paramTypeArr);
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) f.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParamType paramType = ParamType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RouteBuilder(KSerializer kSerializer) {
        this.f3514a = kSerializer;
        this.b = kSerializer.getDescriptor().getB();
    }

    public final void a(String str, String str2) {
        this.d += (this.d.length() == 0 ? "?" : "&") + str + '=' + str2;
    }
}
