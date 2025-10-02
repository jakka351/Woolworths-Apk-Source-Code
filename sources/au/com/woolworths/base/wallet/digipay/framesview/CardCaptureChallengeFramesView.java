package au.com.woolworths.base.wallet.digipay.framesview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.ActionType;
import au.com.woolworths.base.wallet.digipay.framesview.ConfigureFrames;
import au.com.woolworths.base.wallet.digipay.framesview.FramesWebView;
import au.com.woolworths.base.wallet.digipay.framesview.ThreeDSError;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureChallengeFramesView;", "Lau/com/woolworths/base/wallet/digipay/framesview/ChallengeFramesView;", "Lau/com/woolworths/base/wallet/digipay/framesview/ThreeDSChallengeResponse;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CardCaptureChallengeFramesView extends ChallengeFramesView<ThreeDSChallengeResponse> {
    public FramesSDKConfig j;
    public CardChallengeOptions k;
    public androidx.navigation.fragment.e l;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/CardCaptureChallengeFramesView$Companion;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardCaptureChallengeFramesView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView
    public final void a() {
        FramesSDKConfig framesSDKConfig = this.j;
        if (framesSDKConfig == null) {
            throw new IllegalStateException("framesSDKConfig is not initialised");
        }
        if (this.k == null) {
            throw new IllegalStateException("options is not initialised");
        }
        ConfigureFrames.Builder builder = new ConfigureFrames.Builder(this, framesSDKConfig);
        CardChallengeOptions cardChallengeOptions = this.k;
        if (cardChallengeOptions == null) {
            Intrinsics.p("options");
            throw null;
        }
        builder.c = new ActionType.ValidateCard(cardChallengeOptions.f4650a, new ActionType.ThreeDS(true, cardChallengeOptions.b, new ActionType.ConsumerAuthenticationInformation(cardChallengeOptions.c)));
        builder.a(ControlType.h, "overlay", null);
        builder.b();
    }

    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView
    public final CompleteResponse b(String str, Json json) {
        Intrinsics.h(json, "json");
        return (ThreeDSChallengeResponse) json.b(ThreeDSChallengeResponse.INSTANCE.serializer(), str);
    }

    @Override // au.com.woolworths.base.wallet.digipay.framesview.FramesWebView
    public final boolean d(CompleteResponse completeResponse) {
        EnrollmentResponse enrollmentResponse;
        ThreeDSChallengeResponse response = (ThreeDSChallengeResponse) completeResponse;
        Intrinsics.h(response, "response");
        i();
        Data data = response.b.f;
        if (((data == null || (enrollmentResponse = data.f4660a) == null) ? null : enrollmentResponse.f4664a) != EnrollmentResponseStatus.d || response.f4689a != null) {
            androidx.navigation.fragment.e eVar = this.l;
            if (eVar == null) {
                return false;
            }
            eVar.invoke(response);
            return true;
        }
        CardChallengeOptions cardChallengeOptions = this.k;
        if (cardChallengeOptions == null) {
            Intrinsics.p("options");
            throw null;
        }
        FramesWebView.Callback callback = cardChallengeOptions.d.f4673a;
        if (callback != null) {
            ThreeDSError.Companion companion = ThreeDSError.INSTANCE;
            callback.c(new CardCaptureResponse());
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardCaptureChallengeFramesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ CardCaptureChallengeFramesView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardCaptureChallengeFramesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setBackgroundColor(0);
    }
}
