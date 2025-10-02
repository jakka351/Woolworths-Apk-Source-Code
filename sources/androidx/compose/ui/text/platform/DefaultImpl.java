package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* renamed from: a, reason: collision with root package name */
    public State f2142a;

    public final State a() {
        EmojiCompat emojiCompatA = EmojiCompat.a();
        if (emojiCompatA.d() == 1) {
            return new ImmutableBool(true);
        }
        final MutableState mutableStateF = SnapshotStateKt.f(Boolean.FALSE);
        emojiCompatA.k(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public final void a() {
                this.f2142a = EmojiCompatStatus_androidKt.f2145a;
            }

            @Override // androidx.emoji2.text.EmojiCompat.InitCallback
            public final void b() {
                ((SnapshotMutableStateImpl) mutableStateF).setValue(Boolean.TRUE);
                this.f2142a = new ImmutableBool(true);
            }
        });
        return mutableStateF;
    }
}
