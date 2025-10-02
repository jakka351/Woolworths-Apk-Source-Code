package androidx.compose.ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/lang/Object;", "Ljava/text/CharacterIterator;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public final CharSequence d;
    public final int e;
    public int f = 0;

    public CharSequenceCharacterIterator(int i, CharSequence charSequence) {
        this.d = charSequence;
        this.e = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f;
        if (i == this.e) {
            return (char) 65535;
        }
        return this.d.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.e;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.e;
        if (i == 0) {
            this.f = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f = i2;
        return this.d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f + 1;
        this.f = i;
        int i2 = this.e;
        if (i < i2) {
            return this.d.charAt(i);
        }
        this.f = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f = i2;
        return this.d.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.e || i < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f = i;
        return current();
    }
}
