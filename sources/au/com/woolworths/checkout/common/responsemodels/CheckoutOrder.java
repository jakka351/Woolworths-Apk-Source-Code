package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.foundation.shop.model.checkout.CheckoutError;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B«\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001d\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010&\u001a\u00020\u000f\u0012\u0006\u0010'\u001a\u00020\u000f\u0012\u0006\u0010(\u001a\u00020\u000f\u0012\u0006\u0010)\u001a\u00020\u000f\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001d\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001d\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001d\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001d\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\u0014\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001d\u0018\u00010\u001d\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010;\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010<\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u001aHÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\u0010\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\u0010\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\"HÆ\u0003J\u0016\u0010\u0096\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001dHÆ\u0003J\u0010\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u000fHÆ\u0003J\u0010\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020+0\u001dHÆ\u0003J\u0010\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020-0\u001dHÆ\u0003J\u0010\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020/0\u001dHÆ\u0003J\u0010\u0010 \u0001\u001a\b\u0012\u0004\u0012\u0002010\u001dHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u000103HÆ\u0003J\u0018\u0010¢\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001d\u0018\u00010\u001dHÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u000107HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u000109HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010=HÆ\u0003Jþ\u0003\u0010¨\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010!\u001a\u00020\"2\u0014\b\u0002\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001d2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000f2\b\b\u0002\u0010(\u001a\u00020\u000f2\b\b\u0002\u0010)\u001a\u00020\u000f2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001d2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001d2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001d2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001d2\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\u0016\b\u0002\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001d\u0018\u00010\u001d2\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=HÆ\u0001J\u0015\u0010©\u0001\u001a\u00020\u001a2\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010«\u0001\u001a\u00020\rHÖ\u0001J\n\u0010¬\u0001\u001a\u00020\u000bHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0016\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010MR\u0016\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010MR\u0016\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010MR\u0016\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010MR\u0016\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010MR\u0016\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010MR\u0016\u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010MR\u0016\u0010\u0018\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010MR\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010IR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010[R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010[R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R*\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010[\"\u0004\ba\u0010bR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010[R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010[R\u0016\u0010&\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010MR\u0016\u0010'\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010MR\u0016\u0010(\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010MR\u0016\u0010)\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010MR\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010[R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010[R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010[R\u001c\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010[R\u0018\u00102\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR$\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001d\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010[R\u0018\u00106\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0018\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0018\u0010:\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010IR\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010IR\u0018\u0010<\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0011\u0010x\u001a\u00020y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010|\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b|\u0010XR\u001a\u0010}\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010X\"\u0004\b~\u0010\u007f¨\u0006\u00ad\u0001"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrder;", "", "primaryAddress", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutPrimaryAddress;", "delivery", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutDelivery;", "pickup", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutPickUp;", "fulfilment", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutFulfilment;", "rawInstructions", "", "fulfilmentStoreId", "", "savings", "", "teamDiscount", "orderDiscount", "subtotal", "packagingFee", "deliveryFee", "deliveryFeeDiscount", "deliveryFeeBeforeDiscount", "balanceToPay", "storeCredit", "canProceedToPayment", "", "edrNumber", "deliveryNowLimitedItems", "", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutUnavailableProduct;", "unavailableOrderItems", "restrictedOrderItems", "substitution", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutSubstitutionPreference;", "exceededSupplyLimitProductGroups", "restrictedDeliveryMethodItems", "restrictedDeliPlatterItems", "wowRewardsAmount", "redeemableRewardsDollars", "deferredRewardsDollars", "totalIncGst", "errors", "Lau/com/woolworths/foundation/shop/model/checkout/CheckoutError;", "discounts", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutDiscount;", "collectibles", "Lau/com/woolworths/checkout/common/responsemodels/Collectible;", "giftCardPayments", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutGiftCard;", "loyalty", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutLoyalty;", "orderTotalsTableData", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrderTotal;", "leaveUnattended", "Lau/com/woolworths/checkout/common/responsemodels/LeaveUnattended;", "nominatedPersonIdCheck", "Lau/com/woolworths/checkout/common/responsemodels/NominatedPersonIdCheck;", "refundTitle", "refundMessage", "marketDetails", "Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrderMarketDetails;", "<init>", "(Lau/com/woolworths/checkout/common/responsemodels/CheckoutPrimaryAddress;Lau/com/woolworths/checkout/common/responsemodels/CheckoutDelivery;Lau/com/woolworths/checkout/common/responsemodels/CheckoutPickUp;Lau/com/woolworths/checkout/common/responsemodels/CheckoutFulfilment;Ljava/lang/String;IFFFFFFFFFFZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/checkout/common/responsemodels/CheckoutSubstitutionPreference;Ljava/util/List;Ljava/util/List;Ljava/util/List;FFFFLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lau/com/woolworths/checkout/common/responsemodels/CheckoutLoyalty;Ljava/util/List;Lau/com/woolworths/checkout/common/responsemodels/LeaveUnattended;Lau/com/woolworths/checkout/common/responsemodels/NominatedPersonIdCheck;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrderMarketDetails;)V", "getPrimaryAddress", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutPrimaryAddress;", "getDelivery", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutDelivery;", "getPickup", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutPickUp;", "getFulfilment", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutFulfilment;", "getRawInstructions", "()Ljava/lang/String;", "getFulfilmentStoreId", "()I", "getSavings", "()F", "getTeamDiscount", "getOrderDiscount", "getSubtotal", "getPackagingFee", "getDeliveryFee", "getDeliveryFeeDiscount", "getDeliveryFeeBeforeDiscount", "getBalanceToPay", "getStoreCredit", "getCanProceedToPayment", "()Z", "getEdrNumber", "getDeliveryNowLimitedItems", "()Ljava/util/List;", "getUnavailableOrderItems", "getRestrictedOrderItems", "getSubstitution", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutSubstitutionPreference;", "getExceededSupplyLimitProductGroups", "setExceededSupplyLimitProductGroups", "(Ljava/util/List;)V", "getRestrictedDeliveryMethodItems", "getRestrictedDeliPlatterItems", "getWowRewardsAmount", "getRedeemableRewardsDollars", "getDeferredRewardsDollars", "getTotalIncGst", "getErrors", "getDiscounts", "getCollectibles", "getGiftCardPayments", "getLoyalty", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutLoyalty;", "getOrderTotalsTableData", "getLeaveUnattended", "()Lau/com/woolworths/checkout/common/responsemodels/LeaveUnattended;", "getNominatedPersonIdCheck", "()Lau/com/woolworths/checkout/common/responsemodels/NominatedPersonIdCheck;", "getRefundTitle", "getRefundMessage", "getMarketDetails", "()Lau/com/woolworths/checkout/common/responsemodels/CheckoutOrderMarketDetails;", "collectionMode", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "getCollectionMode", "()Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;", "isDeliveryMode", "isDeliveryNowSelected", "setDeliveryNowSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "equals", "other", "hashCode", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutOrder {

    @SerializedName("BalanceToPay")
    private final float balanceToPay;

    @SerializedName("CanProceedToPayment")
    private final boolean canProceedToPayment;

    @SerializedName("BonusItems")
    @NotNull
    private final List<Collectible> collectibles;

    @SerializedName("DeferredWowRewardsDollars")
    private final float deferredRewardsDollars;

    @SerializedName("Delivery")
    @Nullable
    private final CheckoutDelivery delivery;

    @SerializedName("DeliveryFee")
    private final float deliveryFee;

    @SerializedName("DeliveryFeeBeforeDiscount")
    private final float deliveryFeeBeforeDiscount;

    @SerializedName("DeliveryFeeDiscount")
    private final float deliveryFeeDiscount;

    @SerializedName("AvailableOrderItems")
    @NotNull
    private final List<CheckoutUnavailableProduct> deliveryNowLimitedItems;

    @SerializedName("Discounts")
    @NotNull
    private final List<CheckoutDiscount> discounts;

    @SerializedName("EdrNumber")
    @Nullable
    private final String edrNumber;

    @SerializedName("Errors")
    @NotNull
    private final List<CheckoutError> errors;

    @SerializedName("ExceededSupplyLimitProductGroups")
    @NotNull
    private List<? extends List<CheckoutUnavailableProduct>> exceededSupplyLimitProductGroups;

    @SerializedName("Fulfilment")
    @NotNull
    private final CheckoutFulfilment fulfilment;

    @SerializedName("FulfilmentStoreId")
    private final int fulfilmentStoreId;

    @SerializedName("GiftCardPayments")
    @NotNull
    private final List<CheckoutGiftCard> giftCardPayments;
    private boolean isDeliveryNowSelected;

    @SerializedName("LeaveUnattended")
    @Nullable
    private final LeaveUnattended leaveUnattended;

    @SerializedName("Loyalty")
    @Nullable
    private final CheckoutLoyalty loyalty;

    @SerializedName("MarketDetails")
    @Nullable
    private final CheckoutOrderMarketDetails marketDetails;

    @SerializedName("NominatedPersonIdCheck")
    @Nullable
    private final NominatedPersonIdCheck nominatedPersonIdCheck;

    @SerializedName("OrderDiscount")
    private final float orderDiscount;

    @SerializedName("OrderTotalsTableData")
    @Nullable
    private final List<List<CheckoutOrderTotal>> orderTotalsTableData;

    @SerializedName("PackagingFee")
    private final float packagingFee;

    @SerializedName("Pickup")
    @Nullable
    private final CheckoutPickUp pickup;

    @SerializedName("PrimaryAddress")
    @Nullable
    private final CheckoutPrimaryAddress primaryAddress;

    @SerializedName("Instructions")
    @NotNull
    private final String rawInstructions;

    @SerializedName("RedeemableWowRewardsDollars")
    private final float redeemableRewardsDollars;

    @SerializedName("RefundMessage")
    @Nullable
    private final String refundMessage;

    @SerializedName("RefundTitle")
    @Nullable
    private final String refundTitle;

    @SerializedName("RestrictedProductsByDeliPlatter")
    @NotNull
    private final List<CheckoutUnavailableProduct> restrictedDeliPlatterItems;

    @SerializedName("RestrictedProductsByDeliveryMethod")
    @NotNull
    private final List<CheckoutUnavailableProduct> restrictedDeliveryMethodItems;

    @SerializedName("RestrictedOrderItems")
    @NotNull
    private final List<CheckoutUnavailableProduct> restrictedOrderItems;

    @SerializedName("Savings")
    private final float savings;

    @SerializedName("StoreCreditTotal")
    private final float storeCredit;

    @SerializedName("SubstitutionPreferences")
    @NotNull
    private final CheckoutSubstitutionPreference substitution;

    @SerializedName("Subtotal")
    private final float subtotal;

    @SerializedName("TeamDiscount")
    private final float teamDiscount;

    @SerializedName("TotalIncludingGst")
    private final float totalIncGst;

    @SerializedName("UnavailableOrderItems")
    @NotNull
    private final List<CheckoutUnavailableProduct> unavailableOrderItems;

    @SerializedName("WowRewardsPaymentAmount")
    private final float wowRewardsAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutOrder(@Nullable CheckoutPrimaryAddress checkoutPrimaryAddress, @Nullable CheckoutDelivery checkoutDelivery, @Nullable CheckoutPickUp checkoutPickUp, @NotNull CheckoutFulfilment fulfilment, @NotNull String rawInstructions, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, @Nullable String str, @NotNull List<CheckoutUnavailableProduct> deliveryNowLimitedItems, @NotNull List<CheckoutUnavailableProduct> unavailableOrderItems, @NotNull List<CheckoutUnavailableProduct> restrictedOrderItems, @NotNull CheckoutSubstitutionPreference substitution, @NotNull List<? extends List<CheckoutUnavailableProduct>> exceededSupplyLimitProductGroups, @NotNull List<CheckoutUnavailableProduct> restrictedDeliveryMethodItems, @NotNull List<CheckoutUnavailableProduct> restrictedDeliPlatterItems, float f11, float f12, float f13, float f14, @NotNull List<CheckoutError> errors, @NotNull List<CheckoutDiscount> discounts, @NotNull List<Collectible> collectibles, @NotNull List<CheckoutGiftCard> giftCardPayments, @Nullable CheckoutLoyalty checkoutLoyalty, @Nullable List<? extends List<CheckoutOrderTotal>> list, @Nullable LeaveUnattended leaveUnattended, @Nullable NominatedPersonIdCheck nominatedPersonIdCheck, @Nullable String str2, @Nullable String str3, @Nullable CheckoutOrderMarketDetails checkoutOrderMarketDetails) {
        Intrinsics.h(fulfilment, "fulfilment");
        Intrinsics.h(rawInstructions, "rawInstructions");
        Intrinsics.h(deliveryNowLimitedItems, "deliveryNowLimitedItems");
        Intrinsics.h(unavailableOrderItems, "unavailableOrderItems");
        Intrinsics.h(restrictedOrderItems, "restrictedOrderItems");
        Intrinsics.h(substitution, "substitution");
        Intrinsics.h(exceededSupplyLimitProductGroups, "exceededSupplyLimitProductGroups");
        Intrinsics.h(restrictedDeliveryMethodItems, "restrictedDeliveryMethodItems");
        Intrinsics.h(restrictedDeliPlatterItems, "restrictedDeliPlatterItems");
        Intrinsics.h(errors, "errors");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(collectibles, "collectibles");
        Intrinsics.h(giftCardPayments, "giftCardPayments");
        this.primaryAddress = checkoutPrimaryAddress;
        this.delivery = checkoutDelivery;
        this.pickup = checkoutPickUp;
        this.fulfilment = fulfilment;
        this.rawInstructions = rawInstructions;
        this.fulfilmentStoreId = i;
        this.savings = f;
        this.teamDiscount = f2;
        this.orderDiscount = f3;
        this.subtotal = f4;
        this.packagingFee = f5;
        this.deliveryFee = f6;
        this.deliveryFeeDiscount = f7;
        this.deliveryFeeBeforeDiscount = f8;
        this.balanceToPay = f9;
        this.storeCredit = f10;
        this.canProceedToPayment = z;
        this.edrNumber = str;
        this.deliveryNowLimitedItems = deliveryNowLimitedItems;
        this.unavailableOrderItems = unavailableOrderItems;
        this.restrictedOrderItems = restrictedOrderItems;
        this.substitution = substitution;
        this.exceededSupplyLimitProductGroups = exceededSupplyLimitProductGroups;
        this.restrictedDeliveryMethodItems = restrictedDeliveryMethodItems;
        this.restrictedDeliPlatterItems = restrictedDeliPlatterItems;
        this.wowRewardsAmount = f11;
        this.redeemableRewardsDollars = f12;
        this.deferredRewardsDollars = f13;
        this.totalIncGst = f14;
        this.errors = errors;
        this.discounts = discounts;
        this.collectibles = collectibles;
        this.giftCardPayments = giftCardPayments;
        this.loyalty = checkoutLoyalty;
        this.orderTotalsTableData = list;
        this.leaveUnattended = leaveUnattended;
        this.nominatedPersonIdCheck = nominatedPersonIdCheck;
        this.refundTitle = str2;
        this.refundMessage = str3;
        this.marketDetails = checkoutOrderMarketDetails;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final CheckoutPrimaryAddress getPrimaryAddress() {
        return this.primaryAddress;
    }

    /* renamed from: component10, reason: from getter */
    public final float getSubtotal() {
        return this.subtotal;
    }

    /* renamed from: component11, reason: from getter */
    public final float getPackagingFee() {
        return this.packagingFee;
    }

    /* renamed from: component12, reason: from getter */
    public final float getDeliveryFee() {
        return this.deliveryFee;
    }

    /* renamed from: component13, reason: from getter */
    public final float getDeliveryFeeDiscount() {
        return this.deliveryFeeDiscount;
    }

    /* renamed from: component14, reason: from getter */
    public final float getDeliveryFeeBeforeDiscount() {
        return this.deliveryFeeBeforeDiscount;
    }

    /* renamed from: component15, reason: from getter */
    public final float getBalanceToPay() {
        return this.balanceToPay;
    }

    /* renamed from: component16, reason: from getter */
    public final float getStoreCredit() {
        return this.storeCredit;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getCanProceedToPayment() {
        return this.canProceedToPayment;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getEdrNumber() {
        return this.edrNumber;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> component19() {
        return this.deliveryNowLimitedItems;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final CheckoutDelivery getDelivery() {
        return this.delivery;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> component20() {
        return this.unavailableOrderItems;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> component21() {
        return this.restrictedOrderItems;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final CheckoutSubstitutionPreference getSubstitution() {
        return this.substitution;
    }

    @NotNull
    public final List<List<CheckoutUnavailableProduct>> component23() {
        return this.exceededSupplyLimitProductGroups;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> component24() {
        return this.restrictedDeliveryMethodItems;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> component25() {
        return this.restrictedDeliPlatterItems;
    }

    /* renamed from: component26, reason: from getter */
    public final float getWowRewardsAmount() {
        return this.wowRewardsAmount;
    }

    /* renamed from: component27, reason: from getter */
    public final float getRedeemableRewardsDollars() {
        return this.redeemableRewardsDollars;
    }

    /* renamed from: component28, reason: from getter */
    public final float getDeferredRewardsDollars() {
        return this.deferredRewardsDollars;
    }

    /* renamed from: component29, reason: from getter */
    public final float getTotalIncGst() {
        return this.totalIncGst;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final CheckoutPickUp getPickup() {
        return this.pickup;
    }

    @NotNull
    public final List<CheckoutError> component30() {
        return this.errors;
    }

    @NotNull
    public final List<CheckoutDiscount> component31() {
        return this.discounts;
    }

    @NotNull
    public final List<Collectible> component32() {
        return this.collectibles;
    }

    @NotNull
    public final List<CheckoutGiftCard> component33() {
        return this.giftCardPayments;
    }

    @Nullable
    /* renamed from: component34, reason: from getter */
    public final CheckoutLoyalty getLoyalty() {
        return this.loyalty;
    }

    @Nullable
    public final List<List<CheckoutOrderTotal>> component35() {
        return this.orderTotalsTableData;
    }

    @Nullable
    /* renamed from: component36, reason: from getter */
    public final LeaveUnattended getLeaveUnattended() {
        return this.leaveUnattended;
    }

    @Nullable
    /* renamed from: component37, reason: from getter */
    public final NominatedPersonIdCheck getNominatedPersonIdCheck() {
        return this.nominatedPersonIdCheck;
    }

    @Nullable
    /* renamed from: component38, reason: from getter */
    public final String getRefundTitle() {
        return this.refundTitle;
    }

    @Nullable
    /* renamed from: component39, reason: from getter */
    public final String getRefundMessage() {
        return this.refundMessage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CheckoutFulfilment getFulfilment() {
        return this.fulfilment;
    }

    @Nullable
    /* renamed from: component40, reason: from getter */
    public final CheckoutOrderMarketDetails getMarketDetails() {
        return this.marketDetails;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getRawInstructions() {
        return this.rawInstructions;
    }

    /* renamed from: component6, reason: from getter */
    public final int getFulfilmentStoreId() {
        return this.fulfilmentStoreId;
    }

    /* renamed from: component7, reason: from getter */
    public final float getSavings() {
        return this.savings;
    }

    /* renamed from: component8, reason: from getter */
    public final float getTeamDiscount() {
        return this.teamDiscount;
    }

    /* renamed from: component9, reason: from getter */
    public final float getOrderDiscount() {
        return this.orderDiscount;
    }

    @NotNull
    public final CheckoutOrder copy(@Nullable CheckoutPrimaryAddress primaryAddress, @Nullable CheckoutDelivery delivery, @Nullable CheckoutPickUp pickup, @NotNull CheckoutFulfilment fulfilment, @NotNull String rawInstructions, int fulfilmentStoreId, float savings, float teamDiscount, float orderDiscount, float subtotal, float packagingFee, float deliveryFee, float deliveryFeeDiscount, float deliveryFeeBeforeDiscount, float balanceToPay, float storeCredit, boolean canProceedToPayment, @Nullable String edrNumber, @NotNull List<CheckoutUnavailableProduct> deliveryNowLimitedItems, @NotNull List<CheckoutUnavailableProduct> unavailableOrderItems, @NotNull List<CheckoutUnavailableProduct> restrictedOrderItems, @NotNull CheckoutSubstitutionPreference substitution, @NotNull List<? extends List<CheckoutUnavailableProduct>> exceededSupplyLimitProductGroups, @NotNull List<CheckoutUnavailableProduct> restrictedDeliveryMethodItems, @NotNull List<CheckoutUnavailableProduct> restrictedDeliPlatterItems, float wowRewardsAmount, float redeemableRewardsDollars, float deferredRewardsDollars, float totalIncGst, @NotNull List<CheckoutError> errors, @NotNull List<CheckoutDiscount> discounts, @NotNull List<Collectible> collectibles, @NotNull List<CheckoutGiftCard> giftCardPayments, @Nullable CheckoutLoyalty loyalty, @Nullable List<? extends List<CheckoutOrderTotal>> orderTotalsTableData, @Nullable LeaveUnattended leaveUnattended, @Nullable NominatedPersonIdCheck nominatedPersonIdCheck, @Nullable String refundTitle, @Nullable String refundMessage, @Nullable CheckoutOrderMarketDetails marketDetails) {
        Intrinsics.h(fulfilment, "fulfilment");
        Intrinsics.h(rawInstructions, "rawInstructions");
        Intrinsics.h(deliveryNowLimitedItems, "deliveryNowLimitedItems");
        Intrinsics.h(unavailableOrderItems, "unavailableOrderItems");
        Intrinsics.h(restrictedOrderItems, "restrictedOrderItems");
        Intrinsics.h(substitution, "substitution");
        Intrinsics.h(exceededSupplyLimitProductGroups, "exceededSupplyLimitProductGroups");
        Intrinsics.h(restrictedDeliveryMethodItems, "restrictedDeliveryMethodItems");
        Intrinsics.h(restrictedDeliPlatterItems, "restrictedDeliPlatterItems");
        Intrinsics.h(errors, "errors");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(collectibles, "collectibles");
        Intrinsics.h(giftCardPayments, "giftCardPayments");
        return new CheckoutOrder(primaryAddress, delivery, pickup, fulfilment, rawInstructions, fulfilmentStoreId, savings, teamDiscount, orderDiscount, subtotal, packagingFee, deliveryFee, deliveryFeeDiscount, deliveryFeeBeforeDiscount, balanceToPay, storeCredit, canProceedToPayment, edrNumber, deliveryNowLimitedItems, unavailableOrderItems, restrictedOrderItems, substitution, exceededSupplyLimitProductGroups, restrictedDeliveryMethodItems, restrictedDeliPlatterItems, wowRewardsAmount, redeemableRewardsDollars, deferredRewardsDollars, totalIncGst, errors, discounts, collectibles, giftCardPayments, loyalty, orderTotalsTableData, leaveUnattended, nominatedPersonIdCheck, refundTitle, refundMessage, marketDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutOrder)) {
            return false;
        }
        CheckoutOrder checkoutOrder = (CheckoutOrder) other;
        return Intrinsics.c(this.primaryAddress, checkoutOrder.primaryAddress) && Intrinsics.c(this.delivery, checkoutOrder.delivery) && Intrinsics.c(this.pickup, checkoutOrder.pickup) && Intrinsics.c(this.fulfilment, checkoutOrder.fulfilment) && Intrinsics.c(this.rawInstructions, checkoutOrder.rawInstructions) && this.fulfilmentStoreId == checkoutOrder.fulfilmentStoreId && Float.compare(this.savings, checkoutOrder.savings) == 0 && Float.compare(this.teamDiscount, checkoutOrder.teamDiscount) == 0 && Float.compare(this.orderDiscount, checkoutOrder.orderDiscount) == 0 && Float.compare(this.subtotal, checkoutOrder.subtotal) == 0 && Float.compare(this.packagingFee, checkoutOrder.packagingFee) == 0 && Float.compare(this.deliveryFee, checkoutOrder.deliveryFee) == 0 && Float.compare(this.deliveryFeeDiscount, checkoutOrder.deliveryFeeDiscount) == 0 && Float.compare(this.deliveryFeeBeforeDiscount, checkoutOrder.deliveryFeeBeforeDiscount) == 0 && Float.compare(this.balanceToPay, checkoutOrder.balanceToPay) == 0 && Float.compare(this.storeCredit, checkoutOrder.storeCredit) == 0 && this.canProceedToPayment == checkoutOrder.canProceedToPayment && Intrinsics.c(this.edrNumber, checkoutOrder.edrNumber) && Intrinsics.c(this.deliveryNowLimitedItems, checkoutOrder.deliveryNowLimitedItems) && Intrinsics.c(this.unavailableOrderItems, checkoutOrder.unavailableOrderItems) && Intrinsics.c(this.restrictedOrderItems, checkoutOrder.restrictedOrderItems) && Intrinsics.c(this.substitution, checkoutOrder.substitution) && Intrinsics.c(this.exceededSupplyLimitProductGroups, checkoutOrder.exceededSupplyLimitProductGroups) && Intrinsics.c(this.restrictedDeliveryMethodItems, checkoutOrder.restrictedDeliveryMethodItems) && Intrinsics.c(this.restrictedDeliPlatterItems, checkoutOrder.restrictedDeliPlatterItems) && Float.compare(this.wowRewardsAmount, checkoutOrder.wowRewardsAmount) == 0 && Float.compare(this.redeemableRewardsDollars, checkoutOrder.redeemableRewardsDollars) == 0 && Float.compare(this.deferredRewardsDollars, checkoutOrder.deferredRewardsDollars) == 0 && Float.compare(this.totalIncGst, checkoutOrder.totalIncGst) == 0 && Intrinsics.c(this.errors, checkoutOrder.errors) && Intrinsics.c(this.discounts, checkoutOrder.discounts) && Intrinsics.c(this.collectibles, checkoutOrder.collectibles) && Intrinsics.c(this.giftCardPayments, checkoutOrder.giftCardPayments) && Intrinsics.c(this.loyalty, checkoutOrder.loyalty) && Intrinsics.c(this.orderTotalsTableData, checkoutOrder.orderTotalsTableData) && Intrinsics.c(this.leaveUnattended, checkoutOrder.leaveUnattended) && Intrinsics.c(this.nominatedPersonIdCheck, checkoutOrder.nominatedPersonIdCheck) && Intrinsics.c(this.refundTitle, checkoutOrder.refundTitle) && Intrinsics.c(this.refundMessage, checkoutOrder.refundMessage) && Intrinsics.c(this.marketDetails, checkoutOrder.marketDetails);
    }

    public final float getBalanceToPay() {
        return this.balanceToPay;
    }

    public final boolean getCanProceedToPayment() {
        return this.canProceedToPayment;
    }

    @NotNull
    public final List<Collectible> getCollectibles() {
        return this.collectibles;
    }

    @NotNull
    public final CollectionMode getCollectionMode() {
        return CheckoutOrderKt.getCheckoutCollectionMode(this);
    }

    public final float getDeferredRewardsDollars() {
        return this.deferredRewardsDollars;
    }

    @Nullable
    public final CheckoutDelivery getDelivery() {
        return this.delivery;
    }

    public final float getDeliveryFee() {
        return this.deliveryFee;
    }

    public final float getDeliveryFeeBeforeDiscount() {
        return this.deliveryFeeBeforeDiscount;
    }

    public final float getDeliveryFeeDiscount() {
        return this.deliveryFeeDiscount;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> getDeliveryNowLimitedItems() {
        return this.deliveryNowLimitedItems;
    }

    @NotNull
    public final List<CheckoutDiscount> getDiscounts() {
        return this.discounts;
    }

    @Nullable
    public final String getEdrNumber() {
        return this.edrNumber;
    }

    @NotNull
    public final List<CheckoutError> getErrors() {
        return this.errors;
    }

    @NotNull
    public final List<List<CheckoutUnavailableProduct>> getExceededSupplyLimitProductGroups() {
        return this.exceededSupplyLimitProductGroups;
    }

    @NotNull
    public final CheckoutFulfilment getFulfilment() {
        return this.fulfilment;
    }

    public final int getFulfilmentStoreId() {
        return this.fulfilmentStoreId;
    }

    @NotNull
    public final List<CheckoutGiftCard> getGiftCardPayments() {
        return this.giftCardPayments;
    }

    @Nullable
    public final LeaveUnattended getLeaveUnattended() {
        return this.leaveUnattended;
    }

    @Nullable
    public final CheckoutLoyalty getLoyalty() {
        return this.loyalty;
    }

    @Nullable
    public final CheckoutOrderMarketDetails getMarketDetails() {
        return this.marketDetails;
    }

    @Nullable
    public final NominatedPersonIdCheck getNominatedPersonIdCheck() {
        return this.nominatedPersonIdCheck;
    }

    public final float getOrderDiscount() {
        return this.orderDiscount;
    }

    @Nullable
    public final List<List<CheckoutOrderTotal>> getOrderTotalsTableData() {
        return this.orderTotalsTableData;
    }

    public final float getPackagingFee() {
        return this.packagingFee;
    }

    @Nullable
    public final CheckoutPickUp getPickup() {
        return this.pickup;
    }

    @Nullable
    public final CheckoutPrimaryAddress getPrimaryAddress() {
        return this.primaryAddress;
    }

    @NotNull
    public final String getRawInstructions() {
        return this.rawInstructions;
    }

    public final float getRedeemableRewardsDollars() {
        return this.redeemableRewardsDollars;
    }

    @Nullable
    public final String getRefundMessage() {
        return this.refundMessage;
    }

    @Nullable
    public final String getRefundTitle() {
        return this.refundTitle;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> getRestrictedDeliPlatterItems() {
        return this.restrictedDeliPlatterItems;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> getRestrictedDeliveryMethodItems() {
        return this.restrictedDeliveryMethodItems;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> getRestrictedOrderItems() {
        return this.restrictedOrderItems;
    }

    public final float getSavings() {
        return this.savings;
    }

    public final float getStoreCredit() {
        return this.storeCredit;
    }

    @NotNull
    public final CheckoutSubstitutionPreference getSubstitution() {
        return this.substitution;
    }

    public final float getSubtotal() {
        return this.subtotal;
    }

    public final float getTeamDiscount() {
        return this.teamDiscount;
    }

    public final float getTotalIncGst() {
        return this.totalIncGst;
    }

    @NotNull
    public final List<CheckoutUnavailableProduct> getUnavailableOrderItems() {
        return this.unavailableOrderItems;
    }

    public final float getWowRewardsAmount() {
        return this.wowRewardsAmount;
    }

    public int hashCode() {
        CheckoutPrimaryAddress checkoutPrimaryAddress = this.primaryAddress;
        int iHashCode = (checkoutPrimaryAddress == null ? 0 : checkoutPrimaryAddress.hashCode()) * 31;
        CheckoutDelivery checkoutDelivery = this.delivery;
        int iHashCode2 = (iHashCode + (checkoutDelivery == null ? 0 : checkoutDelivery.hashCode())) * 31;
        CheckoutPickUp checkoutPickUp = this.pickup;
        int iE = b.e(a.b(this.storeCredit, a.b(this.balanceToPay, a.b(this.deliveryFeeBeforeDiscount, a.b(this.deliveryFeeDiscount, a.b(this.deliveryFee, a.b(this.packagingFee, a.b(this.subtotal, a.b(this.orderDiscount, a.b(this.teamDiscount, a.b(this.savings, b.a(this.fulfilmentStoreId, b.c((this.fulfilment.hashCode() + ((iHashCode2 + (checkoutPickUp == null ? 0 : checkoutPickUp.hashCode())) * 31)) * 31, 31, this.rawInstructions), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.canProceedToPayment);
        String str = this.edrNumber;
        int iD = b.d(b.d(b.d(b.d(a.b(this.totalIncGst, a.b(this.deferredRewardsDollars, a.b(this.redeemableRewardsDollars, a.b(this.wowRewardsAmount, b.d(b.d(b.d((this.substitution.hashCode() + b.d(b.d(b.d((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.deliveryNowLimitedItems), 31, this.unavailableOrderItems), 31, this.restrictedOrderItems)) * 31, 31, this.exceededSupplyLimitProductGroups), 31, this.restrictedDeliveryMethodItems), 31, this.restrictedDeliPlatterItems), 31), 31), 31), 31), 31, this.errors), 31, this.discounts), 31, this.collectibles), 31, this.giftCardPayments);
        CheckoutLoyalty checkoutLoyalty = this.loyalty;
        int iHashCode3 = (iD + (checkoutLoyalty == null ? 0 : checkoutLoyalty.hashCode())) * 31;
        List<List<CheckoutOrderTotal>> list = this.orderTotalsTableData;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        LeaveUnattended leaveUnattended = this.leaveUnattended;
        int iHashCode5 = (iHashCode4 + (leaveUnattended == null ? 0 : leaveUnattended.hashCode())) * 31;
        NominatedPersonIdCheck nominatedPersonIdCheck = this.nominatedPersonIdCheck;
        int iHashCode6 = (iHashCode5 + (nominatedPersonIdCheck == null ? 0 : nominatedPersonIdCheck.hashCode())) * 31;
        String str2 = this.refundTitle;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refundMessage;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CheckoutOrderMarketDetails checkoutOrderMarketDetails = this.marketDetails;
        return iHashCode8 + (checkoutOrderMarketDetails != null ? checkoutOrderMarketDetails.hashCode() : 0);
    }

    public final boolean isDeliveryMode() {
        return getCollectionMode() instanceof CollectionMode.Delivery;
    }

    /* renamed from: isDeliveryNowSelected, reason: from getter */
    public final boolean getIsDeliveryNowSelected() {
        return this.isDeliveryNowSelected;
    }

    public final void setDeliveryNowSelected(boolean z) {
        this.isDeliveryNowSelected = z;
    }

    public final void setExceededSupplyLimitProductGroups(@NotNull List<? extends List<CheckoutUnavailableProduct>> list) {
        Intrinsics.h(list, "<set-?>");
        this.exceededSupplyLimitProductGroups = list;
    }

    @NotNull
    public String toString() {
        CheckoutPrimaryAddress checkoutPrimaryAddress = this.primaryAddress;
        CheckoutDelivery checkoutDelivery = this.delivery;
        CheckoutPickUp checkoutPickUp = this.pickup;
        CheckoutFulfilment checkoutFulfilment = this.fulfilment;
        String str = this.rawInstructions;
        int i = this.fulfilmentStoreId;
        float f = this.savings;
        float f2 = this.teamDiscount;
        float f3 = this.orderDiscount;
        float f4 = this.subtotal;
        float f5 = this.packagingFee;
        float f6 = this.deliveryFee;
        float f7 = this.deliveryFeeDiscount;
        float f8 = this.deliveryFeeBeforeDiscount;
        float f9 = this.balanceToPay;
        float f10 = this.storeCredit;
        boolean z = this.canProceedToPayment;
        String str2 = this.edrNumber;
        List<CheckoutUnavailableProduct> list = this.deliveryNowLimitedItems;
        List<CheckoutUnavailableProduct> list2 = this.unavailableOrderItems;
        List<CheckoutUnavailableProduct> list3 = this.restrictedOrderItems;
        CheckoutSubstitutionPreference checkoutSubstitutionPreference = this.substitution;
        List<? extends List<CheckoutUnavailableProduct>> list4 = this.exceededSupplyLimitProductGroups;
        List<CheckoutUnavailableProduct> list5 = this.restrictedDeliveryMethodItems;
        List<CheckoutUnavailableProduct> list6 = this.restrictedDeliPlatterItems;
        float f11 = this.wowRewardsAmount;
        float f12 = this.redeemableRewardsDollars;
        float f13 = this.deferredRewardsDollars;
        float f14 = this.totalIncGst;
        List<CheckoutError> list7 = this.errors;
        List<CheckoutDiscount> list8 = this.discounts;
        List<Collectible> list9 = this.collectibles;
        List<CheckoutGiftCard> list10 = this.giftCardPayments;
        CheckoutLoyalty checkoutLoyalty = this.loyalty;
        List<List<CheckoutOrderTotal>> list11 = this.orderTotalsTableData;
        LeaveUnattended leaveUnattended = this.leaveUnattended;
        NominatedPersonIdCheck nominatedPersonIdCheck = this.nominatedPersonIdCheck;
        String str3 = this.refundTitle;
        String str4 = this.refundMessage;
        CheckoutOrderMarketDetails checkoutOrderMarketDetails = this.marketDetails;
        StringBuilder sb = new StringBuilder("CheckoutOrder(primaryAddress=");
        sb.append(checkoutPrimaryAddress);
        sb.append(", delivery=");
        sb.append(checkoutDelivery);
        sb.append(", pickup=");
        sb.append(checkoutPickUp);
        sb.append(", fulfilment=");
        sb.append(checkoutFulfilment);
        sb.append(", rawInstructions=");
        YU.a.x(i, str, ", fulfilmentStoreId=", ", savings=", sb);
        sb.append(f);
        sb.append(", teamDiscount=");
        sb.append(f2);
        sb.append(", orderDiscount=");
        sb.append(f3);
        sb.append(", subtotal=");
        sb.append(f4);
        sb.append(", packagingFee=");
        sb.append(f5);
        sb.append(", deliveryFee=");
        sb.append(f6);
        sb.append(", deliveryFeeDiscount=");
        sb.append(f7);
        sb.append(", deliveryFeeBeforeDiscount=");
        sb.append(f8);
        sb.append(", balanceToPay=");
        sb.append(f9);
        sb.append(", storeCredit=");
        sb.append(f10);
        sb.append(", canProceedToPayment=");
        au.com.woolworths.android.onesite.a.y(", edrNumber=", str2, ", deliveryNowLimitedItems=", sb, z);
        au.com.woolworths.android.onesite.a.C(sb, list, ", unavailableOrderItems=", list2, ", restrictedOrderItems=");
        sb.append(list3);
        sb.append(", substitution=");
        sb.append(checkoutSubstitutionPreference);
        sb.append(", exceededSupplyLimitProductGroups=");
        au.com.woolworths.android.onesite.a.C(sb, list4, ", restrictedDeliveryMethodItems=", list5, ", restrictedDeliPlatterItems=");
        sb.append(list6);
        sb.append(", wowRewardsAmount=");
        sb.append(f11);
        sb.append(", redeemableRewardsDollars=");
        sb.append(f12);
        sb.append(", deferredRewardsDollars=");
        sb.append(f13);
        sb.append(", totalIncGst=");
        sb.append(f14);
        sb.append(", errors=");
        sb.append(list7);
        sb.append(", discounts=");
        au.com.woolworths.android.onesite.a.C(sb, list8, ", collectibles=", list9, ", giftCardPayments=");
        sb.append(list10);
        sb.append(", loyalty=");
        sb.append(checkoutLoyalty);
        sb.append(", orderTotalsTableData=");
        sb.append(list11);
        sb.append(", leaveUnattended=");
        sb.append(leaveUnattended);
        sb.append(", nominatedPersonIdCheck=");
        sb.append(nominatedPersonIdCheck);
        sb.append(", refundTitle=");
        sb.append(str3);
        sb.append(", refundMessage=");
        sb.append(str4);
        sb.append(", marketDetails=");
        sb.append(checkoutOrderMarketDetails);
        sb.append(")");
        return sb.toString();
    }
}
