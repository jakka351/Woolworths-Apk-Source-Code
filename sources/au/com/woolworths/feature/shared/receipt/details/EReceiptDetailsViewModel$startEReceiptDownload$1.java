package au.com.woolworths.feature.shared.receipt.details;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsContract;
import au.com.woolworths.feature.shared.receipt.details.analytics.SharedEReceiptShareError;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDownload;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsViewModel$startEReceiptDownload$1", f = "EReceiptDetailsViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EReceiptDetailsViewModel$startEReceiptDownload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EReceiptDetailsViewModel q;
    public final /* synthetic */ EReceiptDownload r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EReceiptDetailsViewModel$startEReceiptDownload$1(EReceiptDetailsViewModel eReceiptDetailsViewModel, EReceiptDownload eReceiptDownload, Continuation continuation) {
        super(2, continuation);
        this.q = eReceiptDetailsViewModel;
        this.r = eReceiptDownload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EReceiptDetailsViewModel$startEReceiptDownload$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EReceiptDetailsViewModel$startEReceiptDownload$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EReceiptDownload eReceiptDownload = this.r;
        EReceiptDetailsViewModel eReceiptDetailsViewModel = this.q;
        PublishSubject publishSubject = eReceiptDetailsViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    EReceiptDetailsInteractor eReceiptDetailsInteractor = eReceiptDetailsViewModel.e;
                    String filename = eReceiptDownload.getFilename();
                    String url = eReceiptDownload.getUrl();
                    this.p = 1;
                    obj = eReceiptDetailsInteractor.b.a(new File(eReceiptDetailsInteractor.c.getCacheDir(), filename), url, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                publishSubject.onNext(new EReceiptDetailsContract.Actions.OpenShareSheet((String) obj));
            } catch (IOException unused) {
                eReceiptDetailsViewModel.f.j(new SharedEReceiptShareError(eReceiptDetailsViewModel.l), TrackingMetadata.Companion.a(TrackableValue.o0, "Share"));
                publishSubject.onNext(EReceiptDetailsContract.Actions.ShowDownloadErrorMessage.f6551a);
            }
            EReceiptDetailsViewModel.r6(eReceiptDetailsViewModel, eReceiptDetailsViewModel.h, false, false, null, false, null, 29);
            return Unit.f24250a;
        } catch (Throwable th) {
            EReceiptDetailsViewModel.r6(eReceiptDetailsViewModel, eReceiptDetailsViewModel.h, false, false, null, false, null, 29);
            throw th;
        }
    }
}
