package androidx.credentials.provider.utils;

import androidx.credentials.provider.Action;
import androidx.credentials.provider.AuthenticationAction;
import androidx.credentials.provider.CreateEntry;
import androidx.credentials.provider.CredentialEntry;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2538a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ b(int i) {
        Function1 function1;
        this.f2538a = i;
        switch (i) {
            case 1:
                function1 = BeginCreateCredentialUtil$Companion$convertToJetpackResponse$3.h;
                break;
            case 2:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$9.h;
                break;
            case 3:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$1.h;
                break;
            case 4:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$3.h;
                break;
            case 5:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$4.h;
                break;
            case 6:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$6.h;
                break;
            case 7:
                function1 = BeginGetCredentialUtil$Companion$convertToJetpackResponse$7.h;
                break;
            case 8:
                function1 = BeginGetCredentialUtil$Companion$convertToFrameworkRequest$1.h;
                break;
            default:
                function1 = BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1.h;
                break;
        }
        this.b = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2538a) {
            case 0:
                Function1 tmp0 = this.b;
                Intrinsics.h(tmp0, "$tmp0");
                return (CreateEntry) tmp0.invoke(obj);
            case 1:
                Function1 tmp02 = this.b;
                Intrinsics.h(tmp02, "$tmp0");
                return (CreateEntry) tmp02.invoke(obj);
            case 2:
                Function1 tmp03 = this.b;
                Intrinsics.h(tmp03, "$tmp0");
                return (AuthenticationAction) tmp03.invoke(obj);
            case 3:
                Function1 tmp04 = this.b;
                Intrinsics.h(tmp04, "$tmp0");
                return (CredentialEntry) tmp04.invoke(obj);
            case 4:
                Function1 tmp05 = this.b;
                Intrinsics.h(tmp05, "$tmp0");
                return (CredentialEntry) tmp05.invoke(obj);
            case 5:
                Function1 tmp06 = this.b;
                Intrinsics.h(tmp06, "$tmp0");
                return (Action) tmp06.invoke(obj);
            case 6:
                Function1 tmp07 = this.b;
                Intrinsics.h(tmp07, "$tmp0");
                return (Action) tmp07.invoke(obj);
            case 7:
                Function1 tmp08 = this.b;
                Intrinsics.h(tmp08, "$tmp0");
                return (AuthenticationAction) tmp08.invoke(obj);
            default:
                return a.g(BeginGetCredentialUtil$Companion$convertToFrameworkRequest$1.h.invoke(obj));
        }
    }
}
