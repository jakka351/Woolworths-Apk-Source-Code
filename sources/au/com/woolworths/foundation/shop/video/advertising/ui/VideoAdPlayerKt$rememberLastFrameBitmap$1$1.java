package au.com.woolworths.foundation.shop.video.advertising.ui;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import androidx.compose.runtime.MutableState;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$rememberLastFrameBitmap$1$1", f = "VideoAdPlayer.kt", l = {321}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class VideoAdPlayerKt$rememberLastFrameBitmap$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public MutableState p;
    public int q;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ MutableState t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$rememberLastFrameBitmap$1$1$1", f = "VideoAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdPlayerKt$rememberLastFrameBitmap$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        public final /* synthetic */ String p;
        public final /* synthetic */ long q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, Continuation continuation) {
            super(2, continuation);
            this.p = str;
            this.q = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.p, this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            long j = this.q;
            String videoUrl = this.p;
            Intrinsics.h(videoUrl, "videoUrl");
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(videoUrl, new HashMap());
                return mediaMetadataRetriever.getFrameAtTime(j * 1000, 3);
            } catch (Exception e) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.i(new ReportOwner(ReportOwner.Squad.o), "Unable to capture video frame - " + e.getMessage(), null, 12);
                return null;
            } finally {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAdPlayerKt$rememberLastFrameBitmap$1$1(String str, long j, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.r = str;
        this.s = j;
        this.t = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoAdPlayerKt$rememberLastFrameBitmap$1$1(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VideoAdPlayerKt$rememberLastFrameBitmap$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, null);
            MutableState mutableState2 = this.t;
            this.p = mutableState2;
            this.q = 1;
            obj = BuildersKt.f(defaultIoScheduler, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = this.p;
            ResultKt.b(obj);
        }
        mutableState.setValue((Bitmap) obj);
        return Unit.f24250a;
    }
}
