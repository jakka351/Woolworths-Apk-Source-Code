package au.com.woolworths.android.onesite.modules.collectionmode.api;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/collectionmode/api/FulfilmentInfoApiModel;", "", "", "method", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "getLabel", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FulfilmentInfoApiModel {

    @SerializedName("Label")
    @NotNull
    private final String label;

    @SerializedName("Method")
    @NotNull
    private final String method;

    public FulfilmentInfoApiModel(@NotNull String method, @NotNull String label) {
        Intrinsics.h(method, "method");
        Intrinsics.h(label, "label");
        this.method = method;
        this.label = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentInfoApiModel)) {
            return false;
        }
        FulfilmentInfoApiModel fulfilmentInfoApiModel = (FulfilmentInfoApiModel) obj;
        return Intrinsics.c(this.method, fulfilmentInfoApiModel.method) && Intrinsics.c(this.label, fulfilmentInfoApiModel.label);
    }

    public final int hashCode() {
        return this.label.hashCode() + (this.method.hashCode() * 31);
    }

    public final String toString() {
        return a.j("FulfilmentInfoApiModel(method=", this.method, ", label=", this.label, ")");
    }
}
