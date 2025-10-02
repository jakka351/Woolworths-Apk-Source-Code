package com.woolworths.scanlibrary.data.firebase.firestore;

import androidx.camera.core.processing.f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;
import com.google.firebase.firestore.core.b;
import com.woolworths.scanlibrary.base.coroutine.CoroutineContextProvider;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver;
import com.woolworths.scanlibrary.data.cart.SessionInfo;
import com.woolworths.scanlibrary.data.firebase.auth.FirebaseAuthenticationRepositoryImpl;
import com.woolworths.scanlibrary.domain.exit.GetFireStoreAccessUC;
import com.woolworths.scanlibrary.models.authentication.firestore.FireStoreAccessResponse;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.ui.exit.ExitScanCodeViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDataRepositoryImpl;", "Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDataRepository;", "GetFireStoreAccessSingle", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FireStoreDataRepositoryImpl implements FireStoreDataRepository {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuthenticationRepositoryImpl f21158a;
    public final FirebaseFirestore b;
    public final GetFireStoreAccessUC c;
    public final SessionInfo d;
    public final FirebaseCrashlytics e;
    public final CompositeDisposable f;
    public final MutableLiveData g;
    public ExitScanCodeViewModel h;
    public f i;
    public final ContextScope j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/data/firebase/firestore/FireStoreDataRepositoryImpl$GetFireStoreAccessSingle;", "Lcom/woolworths/scanlibrary/base/mvvm/ApiSingleDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/exit/GetFireStoreAccessUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetFireStoreAccessSingle extends ApiSingleDisposableObserver<GetFireStoreAccessUC.ResponseValue> {
        public GetFireStoreAccessSingle() {
            super(23, FireStoreDataRepositoryImpl.this.g);
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void a(int i, ApigeeErrorResponse apigeeErrorResponse, int i2) {
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver
        public final void c(MvpView.ErrorType errorType) {
        }

        @Override // com.woolworths.scanlibrary.base.mvvm.ApiSingleDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetFireStoreAccessUC.ResponseValue response = (GetFireStoreAccessUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            FireStoreAccessResponse fireStoreAccessResponse = response.f21180a;
            String accessToken = fireStoreAccessResponse.getCartNotification().getAccessToken();
            String documentPath = fireStoreAccessResponse.getCartNotification().getDocumentPath();
            FireStoreDataRepositoryImpl fireStoreDataRepositoryImpl = FireStoreDataRepositoryImpl.this;
            BuildersKt.c(fireStoreDataRepositoryImpl.j, null, null, new FireStoreDataRepositoryImpl$GetFireStoreAccessSingle$onSuccess$1(fireStoreDataRepositoryImpl, accessToken, documentPath, null), 3);
        }
    }

    public FireStoreDataRepositoryImpl(FirebaseAuthenticationRepositoryImpl firebaseAuthenticationRepositoryImpl, FirebaseFirestore firebaseFirestore, GetFireStoreAccessUC getFireStoreAccessUC, CoroutineContextProvider coroutineContextProvider, SessionInfo sessionInfo, FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.h(sessionInfo, "sessionInfo");
        this.f21158a = firebaseAuthenticationRepositoryImpl;
        this.b = firebaseFirestore;
        this.c = getFireStoreAccessUC;
        this.d = sessionInfo;
        this.e = firebaseCrashlytics;
        this.f = new CompositeDisposable();
        this.g = new MutableLiveData();
        this.j = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c(JobKt.a(), (CoroutineContext) coroutineContextProvider.b.getD()).plus(new FireStoreDataRepositoryImpl$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.d)));
    }

    @Override // com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepository
    public final void a() {
        CoroutineScopeKt.b(this.j, null);
        this.f21158a.b();
        this.f.e();
    }

    @Override // com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepository
    public final void b() {
        SingleObserveOn singleObserveOnF = this.c.b(new GetFireStoreAccessUC.RequestValues()).f(AndroidSchedulers.a());
        GetFireStoreAccessSingle getFireStoreAccessSingle = new GetFireStoreAccessSingle();
        singleObserveOnF.a(getFireStoreAccessSingle);
        this.f.d(getFireStoreAccessSingle);
    }

    @Override // com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepository
    public final void c(ExitScanCodeViewModel exitScanCodeViewModel) {
        this.h = exitScanCodeViewModel;
    }

    @Override // com.woolworths.scanlibrary.data.firebase.firestore.FireStoreDataRepository
    public final void d() {
        f fVar = this.i;
        if (fVar != null) {
            AsyncEventListener asyncEventListener = (AsyncEventListener) fVar.g;
            FirestoreClient firestoreClient = (FirestoreClient) fVar.e;
            QueryListener queryListener = (QueryListener) fVar.f;
            asyncEventListener.c = true;
            firestoreClient.d.b(new b(firestoreClient, queryListener, 0));
        }
    }
}
