package au.com.woolworths.feature.shop.video;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ ExoPlayer f;

    public /* synthetic */ b(Function2 function2, ExoPlayer exoPlayer, int i) {
        this.d = i;
        this.e = function2;
        this.f = exoPlayer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ExoPlayer exoPlayer = this.f;
                this.e.invoke(Long.valueOf(exoPlayer.getCurrentPosition()), Long.valueOf(exoPlayer.getDuration()));
                break;
            case 1:
                ExoPlayer exoPlayer2 = this.f;
                this.e.invoke(Long.valueOf(exoPlayer2.getCurrentPosition()), Long.valueOf(exoPlayer2.getDuration()));
                break;
            default:
                ExoPlayer exoPlayer3 = this.f;
                this.e.invoke(Long.valueOf(exoPlayer3.getCurrentPosition()), Long.valueOf(exoPlayer3.getDuration()));
                break;
        }
        return Unit.f24250a;
    }
}
