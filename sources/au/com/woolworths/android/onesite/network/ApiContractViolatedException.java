package au.com.woolworths.android.onesite.network;

import androidx.annotation.Keep;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/network/ApiContractViolatedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", lqlqqlq.mmm006Dm006Dm, "", "route", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApiContractViolatedException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiContractViolatedException(@NotNull String description, @Nullable String str) {
        super(description + "\nroute = " + str);
        Intrinsics.h(description, "description");
    }
}
