package au.com.woolworths.foundation.barcode.ui;

import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.barcode.encoder.BarcodeEncoder;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.barcode.ui.BarcodePainterKt$rememberBarcodePainter$1$1", f = "BarcodePainter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BarcodePainterKt$rememberBarcodePainter$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ MutableState r;
    public final /* synthetic */ String s;
    public final /* synthetic */ BarcodeFormat t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ MutableState w;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.barcode.ui.BarcodePainterKt$rememberBarcodePainter$1$1$1", f = "BarcodePainter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.barcode.ui.BarcodePainterKt$rememberBarcodePainter$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String p;
        public final /* synthetic */ BarcodeFormat q;
        public final /* synthetic */ int r;
        public final /* synthetic */ int s;
        public final /* synthetic */ MutableState t;
        public final /* synthetic */ MutableState u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BarcodeFormat barcodeFormat, int i, int i2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
            super(2, continuation);
            this.p = str;
            this.q = barcodeFormat;
            this.r = i;
            this.s = i2;
            this.t = mutableState;
            this.u = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, this.q, this.r, this.s, this.t, this.u, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            try {
                this.t.setValue(BarcodeEncoder.a(this.p, this.q, this.r, this.s, MapsKt.i(new Pair(EncodeHintType.i, new Integer(0)))));
            } catch (WriterException unused) {
                ((Function0) this.u.getD()).invoke();
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodePainterKt$rememberBarcodePainter$1$1(boolean z, MutableState mutableState, String str, BarcodeFormat barcodeFormat, int i, int i2, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.q = z;
        this.r = mutableState;
        this.s = str;
        this.t = barcodeFormat;
        this.u = i;
        this.v = i2;
        this.w = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BarcodePainterKt$rememberBarcodePainter$1$1 barcodePainterKt$rememberBarcodePainter$1$1 = new BarcodePainterKt$rememberBarcodePainter$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
        barcodePainterKt$rememberBarcodePainter$1$1.p = obj;
        return barcodePainterKt$rememberBarcodePainter$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BarcodePainterKt$rememberBarcodePainter$1$1 barcodePainterKt$rememberBarcodePainter$1$1 = (BarcodePainterKt$rememberBarcodePainter$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        barcodePainterKt$rememberBarcodePainter$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        boolean z = this.q;
        MutableState mutableState = this.r;
        Unit unit = Unit.f24250a;
        if (z) {
            ((Function0) mutableState.getD()).invoke();
            return unit;
        }
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        BuildersKt.c(coroutineScope, DefaultIoScheduler.f, null, new AnonymousClass1(this.s, this.t, this.u, this.v, this.w, mutableState, null), 2);
        return unit;
    }
}
