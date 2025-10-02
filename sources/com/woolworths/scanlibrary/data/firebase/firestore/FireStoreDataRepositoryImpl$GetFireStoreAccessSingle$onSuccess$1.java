package com.woolworths.scanlibrary.data.firebase.firestore;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.util.Executors;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl;
import com.woolworths.scanlibrary.models.cart.CartStatus;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepositoryImpl$GetFireStoreAccessSingle$onSuccess$1", f = "FireStoreDataRepositoryImpl.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FireStoreDataRepositoryImpl$GetFireStoreAccessSingle$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FireStoreDataRepositoryImpl q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FireStoreDataRepositoryImpl$GetFireStoreAccessSingle$onSuccess$1(FireStoreDataRepositoryImpl fireStoreDataRepositoryImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.q = fireStoreDataRepositoryImpl;
        this.r = str;
        this.s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FireStoreDataRepositoryImpl$GetFireStoreAccessSingle$onSuccess$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FireStoreDataRepositoryImpl$GetFireStoreAccessSingle$onSuccess$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FirebaseUser firebaseUser;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        final FireStoreDataRepositoryImpl fireStoreDataRepositoryImpl = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                FirebaseAuthenticationRepositoryImpl firebaseAuthenticationRepositoryImpl = fireStoreDataRepositoryImpl.f21158a;
                String str = this.r;
                this.p = 1;
                obj = firebaseAuthenticationRepositoryImpl.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            firebaseUser = (FirebaseUser) obj;
        } catch (FirebaseAuthException e) {
            Timber.f27013a.n(YU.a.A("Firebase auth error ", e.getLocalizedMessage()), e, new Object[0]);
            firebaseUser = null;
        }
        if (firebaseUser != null) {
            SessionInfo sessionInfo = fireStoreDataRepositoryImpl.d;
            sessionInfo.getClass();
            String str2 = this.s;
            Intrinsics.h(str2, "<set-?>");
            sessionInfo.g.setValue(sessionInfo, SessionInfo.k[6], str2);
            fireStoreDataRepositoryImpl.i = fireStoreDataRepositoryImpl.b.a(str2).a(Executors.f15600a, new EventListener() { // from class: com.woolworths.scanlibrary.data.firebase.firestore.a
                @Override // com.google.firebase.firestore.EventListener
                public final void a(Object obj2, FirebaseFirestoreException firebaseFirestoreException) {
                    FireStoreCartDocument fireStoreCartDocument;
                    ExitScanCodeViewModel exitScanCodeViewModel;
                    DocumentSnapshot documentSnapshot = (DocumentSnapshot) obj2;
                    FireStoreDataRepositoryImpl fireStoreDataRepositoryImpl2 = fireStoreDataRepositoryImpl;
                    if (firebaseFirestoreException != null) {
                        Timber.f27013a.p(firebaseFirestoreException);
                        fireStoreDataRepositoryImpl2.e.b(firebaseFirestoreException);
                    }
                    if (documentSnapshot == null || documentSnapshot.c == null || (fireStoreCartDocument = (FireStoreCartDocument) documentSnapshot.b()) == null || (exitScanCodeViewModel = fireStoreDataRepositoryImpl2.h) == null) {
                        return;
                    }
                    CartStatus.Companion companion = CartStatus.INSTANCE;
                    switch (ExitScanCodeViewModel.WhenMappings.f21265a[companion.fromStatusValue(fireStoreCartDocument.getStatus()).ordinal()]) {
                        case 2:
                        case 3:
                        case 7:
                        case 8:
                        case 9:
                            exitScanCodeViewModel.r6(companion.fromStatusValue(fireStoreCartDocument.getStatus()), FireStoreCartDocumentKt.a(fireStoreCartDocument.getKioskflags()));
                            break;
                        case 5:
                        case 6:
                            if (FireStoreCartDocumentKt.a(fireStoreCartDocument.getKioskflags()).isBagCheckCompleted()) {
                                exitScanCodeViewModel.r6(companion.fromStatusValue(fireStoreCartDocument.getStatus()), FireStoreCartDocumentKt.a(fireStoreCartDocument.getKioskflags()));
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return Unit.f24250a;
    }
}
