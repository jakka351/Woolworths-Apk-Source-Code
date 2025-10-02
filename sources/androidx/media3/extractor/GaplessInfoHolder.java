package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
/* loaded from: classes2.dex */
public final class GaplessInfoHolder {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f3242a = -1;
    public int b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = Util.f2928a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f3242a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f2868a;
            if (i >= entryArr.length) {
                return;
            }
            Metadata.Entry entry = entryArr[i];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.c) && a(commentFrame.d)) {
                    return;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.b) && "iTunSMPB".equals(internalFrame.c) && a(internalFrame.d)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
