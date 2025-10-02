package au.com.woolworths.foundation.force.upgrade.impl.datastore;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import au.com.woolworths.foundation.force.upgrade.data.SoftUpgradeAlertBanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/impl/datastore/SoftUpgradeAlertBannerSerializer;", "Landroidx/datastore/core/Serializer;", "Lau/com/woolworths/foundation/force/upgrade/data/SoftUpgradeAlertBanner;", "force-upgrade-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SoftUpgradeAlertBannerSerializer implements Serializer<SoftUpgradeAlertBanner> {

    /* renamed from: a, reason: collision with root package name */
    public static final SoftUpgradeAlertBannerSerializer f8511a = new SoftUpgradeAlertBannerSerializer();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.foundation.force.upgrade.impl.datastore.SoftUpgradeAlertBannerSerializer$writeTo$2", f = "SoftUpgradeAlertBannerStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.foundation.force.upgrade.impl.datastore.SoftUpgradeAlertBannerSerializer$writeTo$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ OutputStream p;
        public final /* synthetic */ SoftUpgradeAlertBanner q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OutputStream outputStream, SoftUpgradeAlertBanner softUpgradeAlertBanner, Continuation continuation) {
            super(2, continuation);
            this.p = outputStream;
            this.q = softUpgradeAlertBanner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.p, this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws IOException {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            this.p.write(StringsKt.u(Json.d.c(SoftUpgradeAlertBanner.INSTANCE.serializer(), this.q)));
            return Unit.f24250a;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* bridge */ /* synthetic */ Object getDefaultValue() {
        return null;
    }

    @Override // androidx.datastore.core.Serializer
    public final Object readFrom(InputStream inputStream, Continuation continuation) throws CorruptionException {
        try {
            return (SoftUpgradeAlertBanner) Json.d.b(SoftUpgradeAlertBanner.INSTANCE.serializer(), StringsKt.r(ByteStreamsKt.b(inputStream)));
        } catch (SerializationException e) {
            throw new CorruptionException("Unable to read SoftUpgradeAlertBanner", e);
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final Object writeTo(Object obj, OutputStream outputStream, Continuation continuation) throws Throwable {
        SoftUpgradeAlertBanner softUpgradeAlertBanner = (SoftUpgradeAlertBanner) obj;
        if (softUpgradeAlertBanner != null) {
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            Object objF = BuildersKt.f(DefaultIoScheduler.f, new AnonymousClass2(outputStream, softUpgradeAlertBanner, null), continuation);
            if (objF == CoroutineSingletons.d) {
                return objF;
            }
        }
        return Unit.f24250a;
    }
}
