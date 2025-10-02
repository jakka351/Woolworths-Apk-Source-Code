package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertyKey<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f2024a;
    public final Function2 b;
    public boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function2<Object, Object, Object> {
        public static final AnonymousClass1 h = new AnonymousClass1(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public SemanticsPropertyKey(String str, Function2 function2) {
        this.f2024a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f2024a;
    }

    public /* synthetic */ SemanticsPropertyKey(String str) {
        this(str, AnonymousClass1.h);
    }

    public SemanticsPropertyKey(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
