package androidx.credentials.provider.utils;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2539a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ c(int i) {
        Function1 function1;
        this.f2539a = i;
        switch (i) {
            case 1:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$8.h;
                break;
            case 2:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$2.h;
                break;
            case 3:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$5.h;
                break;
            default:
                function1 = BeginCreateCredentialUtil$Companion$convertToJetpackResponse$2.h;
                break;
        }
        this.b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f2539a) {
            case 0:
                Function1 tmp0 = this.b;
                Intrinsics.h(tmp0, "$tmp0");
                return ((Boolean) tmp0.invoke(obj)).booleanValue();
            case 1:
                Function1 tmp02 = this.b;
                Intrinsics.h(tmp02, "$tmp0");
                return ((Boolean) tmp02.invoke(obj)).booleanValue();
            case 2:
                Function1 tmp03 = this.b;
                Intrinsics.h(tmp03, "$tmp0");
                return ((Boolean) tmp03.invoke(obj)).booleanValue();
            default:
                Function1 tmp04 = this.b;
                Intrinsics.h(tmp04, "$tmp0");
                return ((Boolean) tmp04.invoke(obj)).booleanValue();
        }
    }
}
