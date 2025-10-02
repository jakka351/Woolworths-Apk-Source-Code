package me.oriient.positioningengine.common;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import me.oriient.internal.services.uploadingManager.models.UploadableSample;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b1\n\u0002\u0010\u0012\n\u0002\bX\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Å\u00012\u00020\u0001:\u0002Å\u0001BÏ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0012\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u00020\u0012\u0012\u0006\u00108\u001a\u00020'\u0012\u0006\u00109\u001a\u00020'\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010;\u001a\u00020'\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003¢\u0006\u0002\u0010?J\n\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010UJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010UJ\n\u0010\u008e\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020'HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020'HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020,HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020,HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¯\u0001\u001a\u000206HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0012HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020'HÆ\u0003J\n\u0010³\u0001\u001a\u00020'HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\n\u0010µ\u0001\u001a\u00020'HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0003HÆ\u0003JÊ\u0004\u0010½\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u00032\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020'2\b\b\u0002\u00109\u001a\u00020'2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010;\u001a\u00020'2\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u0003HÆ\u0001¢\u0006\u0003\u0010¾\u0001J\u0016\u0010¿\u0001\u001a\u00020'2\n\u0010À\u0001\u001a\u0005\u0018\u00010Á\u0001HÖ\u0003J\u000b\u0010Â\u0001\u001a\u00030Ã\u0001HÖ\u0001J\n\u0010Ä\u0001\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0011\u0010/\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0011\u00107\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010AR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bM\u0010FR\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bN\u0010FR\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010AR\u0014\u0010P\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010\u0018\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bS\u0010FR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010V\u001a\u0004\bT\u0010UR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bW\u0010FR\u0011\u0010;\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b;\u0010IR\u0011\u00108\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b8\u0010IR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010AR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bY\u0010FR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010V\u001a\u0004\bZ\u0010UR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010AR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010AR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010AR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010AR\u0011\u0010\u001a\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bc\u0010FR\u0011\u00104\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bd\u0010AR\u0011\u00102\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\be\u0010AR\u0011\u00103\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u0014\u0010g\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010=\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010AR\u0011\u0010>\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010AR\u0011\u0010<\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010AR\u0011\u0010)\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bn\u0010IR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010AR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010AR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010AR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010AR\u0013\u0010:\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\bs\u0010FR\u0011\u0010\u0019\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bt\u0010FR\u0014\u0010u\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010RR\u0011\u00109\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bw\u0010IR\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bx\u0010FR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010AR\u0011\u0010-\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bz\u0010RR\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010AR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\b|\u0010RR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010AR\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0012\u0010%\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010AR\u0012\u0010\u0002\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010AR\u0012\u0010#\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010AR\u0012\u0010\u0004\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010AR\u0012\u0010$\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010A¨\u0006Æ\u0001"}, d2 = {"Lme/oriient/positioningengine/common/ValidationUpdate;", "Lme/oriient/internal/services/uploadingManager/models/UploadableSample;", "x", "", "y", "mx", "my", "mz", "u", "td", "calibError", "a0", "q0", "q1", "q2", "q3", "mapVersion", "mapId", "", "floorId", "f", "t", "deviceId", "deviceType", "engineVersion", "sessionId", "osType", "osLctnX", "osLctnY", "osLctnZ", "osLctnHU", "osLctnVU", "dMx", "dMy", "dMz", "xFreePath", "yFreePath", "velocity", "calibNeeded", "", "lockProgress", "postFirstLock", "elapsedTime", "timestampMillis", "", "timeSinceLastUpdateMillis", "application_state", "background_ratio", "time_diff", "barometer", "os_lctn_lat", "os_lctn_lon", "os_lctn_alt", "user_accuracy", "", "buildingId", "is_smart_cart", "strictMode", "restrictedAreaId", "isSilentMode", "pdr_class", "pdr_accuracy_x", "pdr_accuracy_y", "(DDDDDDDDDDDDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDDDDDDDZDZDJJDDDDDDDFLjava/lang/String;ZZLjava/lang/String;ZDDD)V", "getA0", "()D", "getApplication_state", "getBackground_ratio", "getBarometer", "getBuildingId", "()Ljava/lang/String;", "getCalibError", "getCalibNeeded", "()Z", "getDMx", "getDMy", "getDMz", "getDeviceId", "getDeviceType", "getElapsedTime", "endTimeMillis", "getEndTimeMillis", "()J", "getEngineVersion", "getF", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFloorId", "getLockProgress", "getMapId", "getMapVersion", "getMx", "getMy", "getMz", "getOsLctnHU", "getOsLctnVU", "getOsLctnX", "getOsLctnY", "getOsLctnZ", "getOsType", "getOs_lctn_alt", "getOs_lctn_lat", "getOs_lctn_lon", "payload", "", "getPayload", "()[B", "getPdr_accuracy_x", "getPdr_accuracy_y", "getPdr_class", "getPostFirstLock", "getQ0", "getQ1", "getQ2", "getQ3", "getRestrictedAreaId", "getSessionId", "startTimeMillis", "getStartTimeMillis", "getStrictMode", "getT", "getTd", "getTimeSinceLastUpdateMillis", "getTime_diff", "getTimestampMillis", "getU", "getUser_accuracy", "()F", "getVelocity", "getX", "getXFreePath", "getY", "getYFreePath", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component6", "component7", "component8", "component9", "copy", "(DDDDDDDDDDDDDLjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDDDDDDDZDZDJJDDDDDDDFLjava/lang/String;ZZLjava/lang/String;ZDDD)Lme/oriient/positioningengine/common/ValidationUpdate;", "equals", "other", "", "hashCode", "", "toString", "Companion", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class ValidationUpdate implements UploadableSample {

    @NotNull
    private static final byte[] CHUNK_FILE_HEADER;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final double UPLOADING_FORMAT_VERSION = 4.0d;
    private final double a0;
    private final double application_state;
    private final double background_ratio;
    private final double barometer;

    @NotNull
    private final String buildingId;
    private final double calibError;
    private final boolean calibNeeded;
    private final double dMx;
    private final double dMy;
    private final double dMz;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceType;
    private final double elapsedTime;

    @NotNull
    private final String engineVersion;

    @Nullable
    private final Double f;

    @Nullable
    private final String floorId;
    private final boolean isSilentMode;
    private final boolean is_smart_cart;
    private final double lockProgress;

    @Nullable
    private final String mapId;

    @Nullable
    private final Double mapVersion;
    private final double mx;
    private final double my;
    private final double mz;
    private final double osLctnHU;
    private final double osLctnVU;
    private final double osLctnX;
    private final double osLctnY;
    private final double osLctnZ;

    @NotNull
    private final String osType;
    private final double os_lctn_alt;
    private final double os_lctn_lat;
    private final double os_lctn_lon;
    private final double pdr_accuracy_x;
    private final double pdr_accuracy_y;
    private final double pdr_class;
    private final boolean postFirstLock;
    private final double q0;
    private final double q1;
    private final double q2;
    private final double q3;

    @Nullable
    private final String restrictedAreaId;

    @NotNull
    private final String sessionId;
    private final boolean strictMode;

    @NotNull
    private final String t;
    private final double td;
    private final long timeSinceLastUpdateMillis;
    private final double time_diff;
    private final long timestampMillis;
    private final double u;
    private final float user_accuracy;
    private final double velocity;
    private final double x;
    private final double xFreePath;
    private final double y;
    private final double yFreePath;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lme/oriient/positioningengine/common/ValidationUpdate$Companion;", "", "()V", "CHUNK_FILE_HEADER", "", "getCHUNK_FILE_HEADER", "()[B", "UPLOADING_FORMAT_VERSION", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] getCHUNK_FILE_HEADER() {
            return ValidationUpdate.CHUNK_FILE_HEADER;
        }

        private Companion() {
        }
    }

    static {
        byte[] bytes = CollectionsKt.M(CollectionsKt.R("x", "y", "mx", "my", "mz", "u", "td", "calibError", "a0", "q0", "q1", "q2", "q3", "mapVersion", "mapId", "floorId", "f", "t", "deviceId", "deviceType", "engineVersion", "sessionId", "osType", "osLctnX", "osLctnY", "osLctnZ", "osLctnHU", "osLctnVU", "dMx", "dMy", "dMz", "x_free_path", "y_free_path", "velocity", "calib_needed", "lock_progress", "post_first_lock", "elasped_time", "application_state", "background_ratio", "time_diff", "barometer", "os_lctn_lat", "os_lctn_lon", "os_lctn_alt", "user_accuracy", "buildingId", "is_smart_cart", "strictMode", "restrictedAreaId", "isSilentMode", "pdr_class", "pdr_accuracy_x", "pdr_accuracy_y"), ",", null, "\n", null, 58).getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        CHUNK_FILE_HEADER = bytes;
    }

    public ValidationUpdate(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, @Nullable Double d14, @Nullable String str, @Nullable String str2, @Nullable Double d15, @NotNull String t, @NotNull String deviceId, @NotNull String deviceType, @NotNull String engineVersion, @NotNull String sessionId, @NotNull String osType, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25, double d26, boolean z, double d27, boolean z2, double d28, long j, long j2, double d29, double d30, double d31, double d32, double d33, double d34, double d35, float f, @NotNull String buildingId, boolean z3, boolean z4, @Nullable String str3, boolean z5, double d36, double d37, double d38) {
        Intrinsics.h(t, "t");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(deviceType, "deviceType");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(buildingId, "buildingId");
        this.x = d;
        this.y = d2;
        this.mx = d3;
        this.my = d4;
        this.mz = d5;
        this.u = d6;
        this.td = d7;
        this.calibError = d8;
        this.a0 = d9;
        this.q0 = d10;
        this.q1 = d11;
        this.q2 = d12;
        this.q3 = d13;
        this.mapVersion = d14;
        this.mapId = str;
        this.floorId = str2;
        this.f = d15;
        this.t = t;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.engineVersion = engineVersion;
        this.sessionId = sessionId;
        this.osType = osType;
        this.osLctnX = d16;
        this.osLctnY = d17;
        this.osLctnZ = d18;
        this.osLctnHU = d19;
        this.osLctnVU = d20;
        this.dMx = d21;
        this.dMy = d22;
        this.dMz = d23;
        this.xFreePath = d24;
        this.yFreePath = d25;
        this.velocity = d26;
        this.calibNeeded = z;
        this.lockProgress = d27;
        this.postFirstLock = z2;
        this.elapsedTime = d28;
        this.timestampMillis = j;
        this.timeSinceLastUpdateMillis = j2;
        this.application_state = d29;
        this.background_ratio = d30;
        this.time_diff = d31;
        this.barometer = d32;
        this.os_lctn_lat = d33;
        this.os_lctn_lon = d34;
        this.os_lctn_alt = d35;
        this.user_accuracy = f;
        this.buildingId = buildingId;
        this.is_smart_cart = z3;
        this.strictMode = z4;
        this.restrictedAreaId = str3;
        this.isSilentMode = z5;
        this.pdr_class = d36;
        this.pdr_accuracy_x = d37;
        this.pdr_accuracy_y = d38;
    }

    public static /* synthetic */ ValidationUpdate copy$default(ValidationUpdate validationUpdate, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, Double d14, String str, String str2, Double d15, String str3, String str4, String str5, String str6, String str7, String str8, double d16, double d17, double d18, double d19, double d20, double d21, double d22, double d23, double d24, double d25, double d26, boolean z, double d27, boolean z2, double d28, long j, long j2, double d29, double d30, double d31, double d32, double d33, double d34, double d35, float f, String str9, boolean z3, boolean z4, String str10, boolean z5, double d36, double d37, double d38, int i, int i2, Object obj) {
        double d39;
        double d40;
        double d41;
        double d42;
        double d43;
        double d44;
        double d45;
        float f2;
        boolean z6;
        boolean z7;
        String str11;
        String str12;
        boolean z8;
        double d46;
        double d47;
        double d48;
        boolean z9;
        long j3;
        long j4;
        double d49;
        double d50;
        double d51;
        double d52;
        double d53;
        double d54;
        double d55;
        double d56;
        boolean z10;
        double d57;
        String str13;
        String str14;
        double d58;
        double d59;
        double d60;
        double d61;
        double d62;
        double d63;
        double d64;
        double d65;
        String str15;
        Double d66;
        String str16;
        String str17;
        String str18;
        String str19;
        double d67 = (i & 1) != 0 ? validationUpdate.x : d;
        double d68 = (i & 2) != 0 ? validationUpdate.y : d2;
        double d69 = (i & 4) != 0 ? validationUpdate.mx : d3;
        double d70 = (i & 8) != 0 ? validationUpdate.my : d4;
        double d71 = (i & 16) != 0 ? validationUpdate.mz : d5;
        double d72 = (i & 32) != 0 ? validationUpdate.u : d6;
        if ((i & 64) != 0) {
            d39 = d67;
            d40 = validationUpdate.td;
        } else {
            d39 = d67;
            d40 = d7;
        }
        double d73 = d40;
        double d74 = (i & 128) != 0 ? validationUpdate.calibError : d8;
        double d75 = (i & 256) != 0 ? validationUpdate.a0 : d9;
        double d76 = (i & 512) != 0 ? validationUpdate.q0 : d10;
        double d77 = (i & 1024) != 0 ? validationUpdate.q1 : d11;
        double d78 = (i & 2048) != 0 ? validationUpdate.q2 : d12;
        double d79 = (i & 4096) != 0 ? validationUpdate.q3 : d13;
        Double d80 = (i & 8192) != 0 ? validationUpdate.mapVersion : d14;
        String str20 = (i & 16384) != 0 ? validationUpdate.mapId : str;
        String str21 = (i & 32768) != 0 ? validationUpdate.floorId : str2;
        Double d81 = (i & 65536) != 0 ? validationUpdate.f : d15;
        String str22 = (i & 131072) != 0 ? validationUpdate.t : str3;
        String str23 = (i & 262144) != 0 ? validationUpdate.deviceId : str4;
        String str24 = (i & 524288) != 0 ? validationUpdate.deviceType : str5;
        String str25 = (i & 1048576) != 0 ? validationUpdate.engineVersion : str6;
        String str26 = (i & 2097152) != 0 ? validationUpdate.sessionId : str7;
        String str27 = (i & 4194304) != 0 ? validationUpdate.osType : str8;
        Double d82 = d80;
        String str28 = str20;
        double d83 = (i & 8388608) != 0 ? validationUpdate.osLctnX : d16;
        double d84 = (i & 16777216) != 0 ? validationUpdate.osLctnY : d17;
        double d85 = (i & 33554432) != 0 ? validationUpdate.osLctnZ : d18;
        double d86 = (i & 67108864) != 0 ? validationUpdate.osLctnHU : d19;
        double d87 = (i & 134217728) != 0 ? validationUpdate.osLctnVU : d20;
        double d88 = (i & 268435456) != 0 ? validationUpdate.dMx : d21;
        double d89 = (i & 536870912) != 0 ? validationUpdate.dMy : d22;
        double d90 = (i & 1073741824) != 0 ? validationUpdate.dMz : d23;
        double d91 = (i & Integer.MIN_VALUE) != 0 ? validationUpdate.xFreePath : d24;
        double d92 = (i2 & 1) != 0 ? validationUpdate.yFreePath : d25;
        double d93 = (i2 & 2) != 0 ? validationUpdate.velocity : d26;
        String str29 = str27;
        boolean z11 = (i2 & 4) != 0 ? validationUpdate.calibNeeded : z;
        double d94 = d93;
        double d95 = (i2 & 8) != 0 ? validationUpdate.lockProgress : d27;
        boolean z12 = z11;
        boolean z13 = (i2 & 16) != 0 ? validationUpdate.postFirstLock : z2;
        double d96 = d95;
        double d97 = (i2 & 32) != 0 ? validationUpdate.elapsedTime : d28;
        boolean z14 = z13;
        long j5 = (i2 & 64) != 0 ? validationUpdate.timestampMillis : j;
        long j6 = (i2 & 128) != 0 ? validationUpdate.timeSinceLastUpdateMillis : j2;
        double d98 = (i2 & 256) != 0 ? validationUpdate.application_state : d29;
        double d99 = (i2 & 512) != 0 ? validationUpdate.background_ratio : d30;
        double d100 = (i2 & 1024) != 0 ? validationUpdate.time_diff : d31;
        double d101 = (i2 & 2048) != 0 ? validationUpdate.barometer : d32;
        double d102 = (i2 & 4096) != 0 ? validationUpdate.os_lctn_lat : d33;
        double d103 = (i2 & 8192) != 0 ? validationUpdate.os_lctn_lon : d34;
        double d104 = (i2 & 16384) != 0 ? validationUpdate.os_lctn_alt : d35;
        float f3 = (i2 & 32768) != 0 ? validationUpdate.user_accuracy : f;
        String str30 = (i2 & 65536) != 0 ? validationUpdate.buildingId : str9;
        float f4 = f3;
        boolean z15 = (i2 & 131072) != 0 ? validationUpdate.is_smart_cart : z3;
        boolean z16 = (i2 & 262144) != 0 ? validationUpdate.strictMode : z4;
        String str31 = (i2 & 524288) != 0 ? validationUpdate.restrictedAreaId : str10;
        boolean z17 = (i2 & 1048576) != 0 ? validationUpdate.isSilentMode : z5;
        String str32 = str30;
        double d105 = (i2 & 2097152) != 0 ? validationUpdate.pdr_class : d36;
        double d106 = (i2 & 4194304) != 0 ? validationUpdate.pdr_accuracy_x : d37;
        if ((i2 & 8388608) != 0) {
            d42 = d106;
            d41 = validationUpdate.pdr_accuracy_y;
            d44 = d102;
            d45 = d104;
            f2 = f4;
            z6 = z15;
            z7 = z16;
            str11 = str31;
            str12 = str32;
            z8 = z17;
            d46 = d105;
            d47 = d103;
            d48 = d97;
            j3 = j5;
            j4 = j6;
            d49 = d98;
            d50 = d99;
            d51 = d100;
            d43 = d101;
            d53 = d90;
            d54 = d91;
            d55 = d92;
            d56 = d94;
            z10 = z12;
            d57 = d96;
            z9 = z14;
            d58 = d83;
            d59 = d84;
            d60 = d85;
            d61 = d86;
            d62 = d87;
            d63 = d88;
            d52 = d89;
            str13 = str29;
            d64 = d78;
            d65 = d79;
            str15 = str21;
            d66 = d81;
            str16 = str22;
            str17 = str23;
            str18 = str24;
            str19 = str25;
            str14 = str26;
        } else {
            d41 = d38;
            d42 = d106;
            d43 = d101;
            d44 = d102;
            d45 = d104;
            f2 = f4;
            z6 = z15;
            z7 = z16;
            str11 = str31;
            str12 = str32;
            z8 = z17;
            d46 = d105;
            d47 = d103;
            d48 = d97;
            z9 = z14;
            j3 = j5;
            j4 = j6;
            d49 = d98;
            d50 = d99;
            d51 = d100;
            d52 = d89;
            d53 = d90;
            d54 = d91;
            d55 = d92;
            d56 = d94;
            z10 = z12;
            d57 = d96;
            str13 = str29;
            str14 = str26;
            d58 = d83;
            d59 = d84;
            d60 = d85;
            d61 = d86;
            d62 = d87;
            d63 = d88;
            d64 = d78;
            d65 = d79;
            str15 = str21;
            d66 = d81;
            str16 = str22;
            str17 = str23;
            str18 = str24;
            str19 = str25;
        }
        return validationUpdate.copy(d39, d68, d69, d70, d71, d72, d73, d74, d75, d76, d77, d64, d65, d82, str28, str15, d66, str16, str17, str18, str19, str14, str13, d58, d59, d60, d61, d62, d63, d52, d53, d54, d55, d56, z10, d57, z9, d48, j3, j4, d49, d50, d51, d43, d44, d47, d45, f2, str12, z6, z7, str11, z8, d46, d42, d41);
    }

    /* renamed from: component1, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component10, reason: from getter */
    public final double getQ0() {
        return this.q0;
    }

    /* renamed from: component11, reason: from getter */
    public final double getQ1() {
        return this.q1;
    }

    /* renamed from: component12, reason: from getter */
    public final double getQ2() {
        return this.q2;
    }

    /* renamed from: component13, reason: from getter */
    public final double getQ3() {
        return this.q3;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getMapVersion() {
        return this.mapVersion;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Double getF() {
        return this.f;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    /* renamed from: component20, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component23, reason: from getter */
    public final String getOsType() {
        return this.osType;
    }

    /* renamed from: component24, reason: from getter */
    public final double getOsLctnX() {
        return this.osLctnX;
    }

    /* renamed from: component25, reason: from getter */
    public final double getOsLctnY() {
        return this.osLctnY;
    }

    /* renamed from: component26, reason: from getter */
    public final double getOsLctnZ() {
        return this.osLctnZ;
    }

    /* renamed from: component27, reason: from getter */
    public final double getOsLctnHU() {
        return this.osLctnHU;
    }

    /* renamed from: component28, reason: from getter */
    public final double getOsLctnVU() {
        return this.osLctnVU;
    }

    /* renamed from: component29, reason: from getter */
    public final double getDMx() {
        return this.dMx;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMx() {
        return this.mx;
    }

    /* renamed from: component30, reason: from getter */
    public final double getDMy() {
        return this.dMy;
    }

    /* renamed from: component31, reason: from getter */
    public final double getDMz() {
        return this.dMz;
    }

    /* renamed from: component32, reason: from getter */
    public final double getXFreePath() {
        return this.xFreePath;
    }

    /* renamed from: component33, reason: from getter */
    public final double getYFreePath() {
        return this.yFreePath;
    }

    /* renamed from: component34, reason: from getter */
    public final double getVelocity() {
        return this.velocity;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getCalibNeeded() {
        return this.calibNeeded;
    }

    /* renamed from: component36, reason: from getter */
    public final double getLockProgress() {
        return this.lockProgress;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getPostFirstLock() {
        return this.postFirstLock;
    }

    /* renamed from: component38, reason: from getter */
    public final double getElapsedTime() {
        return this.elapsedTime;
    }

    /* renamed from: component39, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMy() {
        return this.my;
    }

    /* renamed from: component40, reason: from getter */
    public final long getTimeSinceLastUpdateMillis() {
        return this.timeSinceLastUpdateMillis;
    }

    /* renamed from: component41, reason: from getter */
    public final double getApplication_state() {
        return this.application_state;
    }

    /* renamed from: component42, reason: from getter */
    public final double getBackground_ratio() {
        return this.background_ratio;
    }

    /* renamed from: component43, reason: from getter */
    public final double getTime_diff() {
        return this.time_diff;
    }

    /* renamed from: component44, reason: from getter */
    public final double getBarometer() {
        return this.barometer;
    }

    /* renamed from: component45, reason: from getter */
    public final double getOs_lctn_lat() {
        return this.os_lctn_lat;
    }

    /* renamed from: component46, reason: from getter */
    public final double getOs_lctn_lon() {
        return this.os_lctn_lon;
    }

    /* renamed from: component47, reason: from getter */
    public final double getOs_lctn_alt() {
        return this.os_lctn_alt;
    }

    /* renamed from: component48, reason: from getter */
    public final float getUser_accuracy() {
        return this.user_accuracy;
    }

    @NotNull
    /* renamed from: component49, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMz() {
        return this.mz;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getIs_smart_cart() {
        return this.is_smart_cart;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getStrictMode() {
        return this.strictMode;
    }

    @Nullable
    /* renamed from: component52, reason: from getter */
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    /* renamed from: component53, reason: from getter */
    public final boolean getIsSilentMode() {
        return this.isSilentMode;
    }

    /* renamed from: component54, reason: from getter */
    public final double getPdr_class() {
        return this.pdr_class;
    }

    /* renamed from: component55, reason: from getter */
    public final double getPdr_accuracy_x() {
        return this.pdr_accuracy_x;
    }

    /* renamed from: component56, reason: from getter */
    public final double getPdr_accuracy_y() {
        return this.pdr_accuracy_y;
    }

    /* renamed from: component6, reason: from getter */
    public final double getU() {
        return this.u;
    }

    /* renamed from: component7, reason: from getter */
    public final double getTd() {
        return this.td;
    }

    /* renamed from: component8, reason: from getter */
    public final double getCalibError() {
        return this.calibError;
    }

    /* renamed from: component9, reason: from getter */
    public final double getA0() {
        return this.a0;
    }

    @NotNull
    public final ValidationUpdate copy(double x, double y, double mx, double my, double mz, double u, double td, double calibError, double a0, double q0, double q1, double q2, double q3, @Nullable Double mapVersion, @Nullable String mapId, @Nullable String floorId, @Nullable Double f, @NotNull String t, @NotNull String deviceId, @NotNull String deviceType, @NotNull String engineVersion, @NotNull String sessionId, @NotNull String osType, double osLctnX, double osLctnY, double osLctnZ, double osLctnHU, double osLctnVU, double dMx, double dMy, double dMz, double xFreePath, double yFreePath, double velocity, boolean calibNeeded, double lockProgress, boolean postFirstLock, double elapsedTime, long timestampMillis, long timeSinceLastUpdateMillis, double application_state, double background_ratio, double time_diff, double barometer, double os_lctn_lat, double os_lctn_lon, double os_lctn_alt, float user_accuracy, @NotNull String buildingId, boolean is_smart_cart, boolean strictMode, @Nullable String restrictedAreaId, boolean isSilentMode, double pdr_class, double pdr_accuracy_x, double pdr_accuracy_y) {
        Intrinsics.h(t, "t");
        Intrinsics.h(deviceId, "deviceId");
        Intrinsics.h(deviceType, "deviceType");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(sessionId, "sessionId");
        Intrinsics.h(osType, "osType");
        Intrinsics.h(buildingId, "buildingId");
        return new ValidationUpdate(x, y, mx, my, mz, u, td, calibError, a0, q0, q1, q2, q3, mapVersion, mapId, floorId, f, t, deviceId, deviceType, engineVersion, sessionId, osType, osLctnX, osLctnY, osLctnZ, osLctnHU, osLctnVU, dMx, dMy, dMz, xFreePath, yFreePath, velocity, calibNeeded, lockProgress, postFirstLock, elapsedTime, timestampMillis, timeSinceLastUpdateMillis, application_state, background_ratio, time_diff, barometer, os_lctn_lat, os_lctn_lon, os_lctn_alt, user_accuracy, buildingId, is_smart_cart, strictMode, restrictedAreaId, isSilentMode, pdr_class, pdr_accuracy_x, pdr_accuracy_y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationUpdate)) {
            return false;
        }
        ValidationUpdate validationUpdate = (ValidationUpdate) other;
        return Double.compare(this.x, validationUpdate.x) == 0 && Double.compare(this.y, validationUpdate.y) == 0 && Double.compare(this.mx, validationUpdate.mx) == 0 && Double.compare(this.my, validationUpdate.my) == 0 && Double.compare(this.mz, validationUpdate.mz) == 0 && Double.compare(this.u, validationUpdate.u) == 0 && Double.compare(this.td, validationUpdate.td) == 0 && Double.compare(this.calibError, validationUpdate.calibError) == 0 && Double.compare(this.a0, validationUpdate.a0) == 0 && Double.compare(this.q0, validationUpdate.q0) == 0 && Double.compare(this.q1, validationUpdate.q1) == 0 && Double.compare(this.q2, validationUpdate.q2) == 0 && Double.compare(this.q3, validationUpdate.q3) == 0 && Intrinsics.c(this.mapVersion, validationUpdate.mapVersion) && Intrinsics.c(this.mapId, validationUpdate.mapId) && Intrinsics.c(this.floorId, validationUpdate.floorId) && Intrinsics.c(this.f, validationUpdate.f) && Intrinsics.c(this.t, validationUpdate.t) && Intrinsics.c(this.deviceId, validationUpdate.deviceId) && Intrinsics.c(this.deviceType, validationUpdate.deviceType) && Intrinsics.c(this.engineVersion, validationUpdate.engineVersion) && Intrinsics.c(this.sessionId, validationUpdate.sessionId) && Intrinsics.c(this.osType, validationUpdate.osType) && Double.compare(this.osLctnX, validationUpdate.osLctnX) == 0 && Double.compare(this.osLctnY, validationUpdate.osLctnY) == 0 && Double.compare(this.osLctnZ, validationUpdate.osLctnZ) == 0 && Double.compare(this.osLctnHU, validationUpdate.osLctnHU) == 0 && Double.compare(this.osLctnVU, validationUpdate.osLctnVU) == 0 && Double.compare(this.dMx, validationUpdate.dMx) == 0 && Double.compare(this.dMy, validationUpdate.dMy) == 0 && Double.compare(this.dMz, validationUpdate.dMz) == 0 && Double.compare(this.xFreePath, validationUpdate.xFreePath) == 0 && Double.compare(this.yFreePath, validationUpdate.yFreePath) == 0 && Double.compare(this.velocity, validationUpdate.velocity) == 0 && this.calibNeeded == validationUpdate.calibNeeded && Double.compare(this.lockProgress, validationUpdate.lockProgress) == 0 && this.postFirstLock == validationUpdate.postFirstLock && Double.compare(this.elapsedTime, validationUpdate.elapsedTime) == 0 && this.timestampMillis == validationUpdate.timestampMillis && this.timeSinceLastUpdateMillis == validationUpdate.timeSinceLastUpdateMillis && Double.compare(this.application_state, validationUpdate.application_state) == 0 && Double.compare(this.background_ratio, validationUpdate.background_ratio) == 0 && Double.compare(this.time_diff, validationUpdate.time_diff) == 0 && Double.compare(this.barometer, validationUpdate.barometer) == 0 && Double.compare(this.os_lctn_lat, validationUpdate.os_lctn_lat) == 0 && Double.compare(this.os_lctn_lon, validationUpdate.os_lctn_lon) == 0 && Double.compare(this.os_lctn_alt, validationUpdate.os_lctn_alt) == 0 && Float.compare(this.user_accuracy, validationUpdate.user_accuracy) == 0 && Intrinsics.c(this.buildingId, validationUpdate.buildingId) && this.is_smart_cart == validationUpdate.is_smart_cart && this.strictMode == validationUpdate.strictMode && Intrinsics.c(this.restrictedAreaId, validationUpdate.restrictedAreaId) && this.isSilentMode == validationUpdate.isSilentMode && Double.compare(this.pdr_class, validationUpdate.pdr_class) == 0 && Double.compare(this.pdr_accuracy_x, validationUpdate.pdr_accuracy_x) == 0 && Double.compare(this.pdr_accuracy_y, validationUpdate.pdr_accuracy_y) == 0;
    }

    public final double getA0() {
        return this.a0;
    }

    public final double getApplication_state() {
        return this.application_state;
    }

    public final double getBackground_ratio() {
        return this.background_ratio;
    }

    public final double getBarometer() {
        return this.barometer;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final double getCalibError() {
        return this.calibError;
    }

    public final boolean getCalibNeeded() {
        return this.calibNeeded;
    }

    public final double getDMx() {
        return this.dMx;
    }

    public final double getDMy() {
        return this.dMy;
    }

    public final double getDMz() {
        return this.dMz;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final double getElapsedTime() {
        return this.elapsedTime;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public long getEndTimeMillis() {
        return this.timestampMillis;
    }

    @NotNull
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    @Nullable
    public final Double getF() {
        return this.f;
    }

    @Nullable
    public final String getFloorId() {
        return this.floorId;
    }

    public final double getLockProgress() {
        return this.lockProgress;
    }

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    public final Double getMapVersion() {
        return this.mapVersion;
    }

    public final double getMx() {
        return this.mx;
    }

    public final double getMy() {
        return this.my;
    }

    public final double getMz() {
        return this.mz;
    }

    public final double getOsLctnHU() {
        return this.osLctnHU;
    }

    public final double getOsLctnVU() {
        return this.osLctnVU;
    }

    public final double getOsLctnX() {
        return this.osLctnX;
    }

    public final double getOsLctnY() {
        return this.osLctnY;
    }

    public final double getOsLctnZ() {
        return this.osLctnZ;
    }

    @NotNull
    public final String getOsType() {
        return this.osType;
    }

    public final double getOs_lctn_alt() {
        return this.os_lctn_alt;
    }

    public final double getOs_lctn_lat() {
        return this.os_lctn_lat;
    }

    public final double getOs_lctn_lon() {
        return this.os_lctn_lon;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    @NotNull
    public byte[] getPayload() {
        String strValueOf = String.valueOf(this.x);
        String strValueOf2 = String.valueOf(this.y);
        String strValueOf3 = String.valueOf(this.mx);
        String strValueOf4 = String.valueOf(this.my);
        String strValueOf5 = String.valueOf(this.mz);
        String strValueOf6 = String.valueOf(this.u);
        String strValueOf7 = String.valueOf(this.td);
        String strValueOf8 = String.valueOf(this.calibError);
        String strValueOf9 = String.valueOf(this.a0);
        String strValueOf10 = String.valueOf(this.q0);
        String strValueOf11 = String.valueOf(this.q1);
        String strValueOf12 = String.valueOf(this.q2);
        String strValueOf13 = String.valueOf(this.q3);
        Double d = this.mapVersion;
        String strValueOf14 = d != null ? String.valueOf(d) : "";
        String str = this.mapId;
        String str2 = str == null ? "" : str;
        String str3 = this.floorId;
        String str4 = str3 == null ? "" : str3;
        Double d2 = this.f;
        String strValueOf15 = d2 != null ? String.valueOf(d2) : "";
        String str5 = this.t;
        String str6 = this.deviceId;
        String strQ = StringsKt.Q(this.deviceType, ",", ".", false);
        String str7 = this.engineVersion;
        String str8 = this.sessionId;
        String strQ2 = StringsKt.Q(this.osType, ",", ".", false);
        String strValueOf16 = String.valueOf(this.osLctnX);
        String strValueOf17 = String.valueOf(this.osLctnY);
        String strValueOf18 = String.valueOf(this.osLctnZ);
        String strValueOf19 = String.valueOf(this.osLctnHU);
        String strValueOf20 = String.valueOf(this.osLctnVU);
        String strValueOf21 = String.valueOf(this.dMx);
        String strValueOf22 = String.valueOf(this.dMy);
        String strValueOf23 = String.valueOf(this.dMz);
        String strValueOf24 = String.valueOf(this.xFreePath);
        String strValueOf25 = String.valueOf(this.yFreePath);
        String strValueOf26 = String.valueOf(this.velocity);
        String strValueOf27 = String.valueOf(this.calibNeeded);
        String strValueOf28 = String.valueOf(this.lockProgress);
        String strValueOf29 = String.valueOf(this.postFirstLock);
        String strValueOf30 = String.valueOf(this.elapsedTime);
        String strValueOf31 = String.valueOf(this.application_state);
        String strValueOf32 = String.valueOf(this.background_ratio);
        String strValueOf33 = String.valueOf(this.time_diff);
        String strValueOf34 = String.valueOf(this.barometer);
        String strValueOf35 = String.valueOf(this.os_lctn_lat);
        String strValueOf36 = String.valueOf(this.os_lctn_lon);
        String strValueOf37 = String.valueOf(this.os_lctn_alt);
        String strValueOf38 = String.valueOf(this.user_accuracy);
        String str9 = this.buildingId;
        String strValueOf39 = String.valueOf(this.is_smart_cart);
        String strValueOf40 = String.valueOf(this.strictMode);
        String str10 = this.restrictedAreaId;
        byte[] bytes = CollectionsKt.M(CollectionsKt.R(strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, strValueOf8, strValueOf9, strValueOf10, strValueOf11, strValueOf12, strValueOf13, strValueOf14, str2, str4, strValueOf15, str5, str6, strQ, str7, str8, strQ2, strValueOf16, strValueOf17, strValueOf18, strValueOf19, strValueOf20, strValueOf21, strValueOf22, strValueOf23, strValueOf24, strValueOf25, strValueOf26, strValueOf27, strValueOf28, strValueOf29, strValueOf30, strValueOf31, strValueOf32, strValueOf33, strValueOf34, strValueOf35, strValueOf36, strValueOf37, strValueOf38, str9, strValueOf39, strValueOf40, str10 == null ? "" : str10, String.valueOf(this.isSilentMode), String.valueOf(this.pdr_class), String.valueOf(this.pdr_accuracy_x), String.valueOf(this.pdr_accuracy_y)), ",", null, "\n", null, 58).getBytes(Charsets.f24671a);
        Intrinsics.g(bytes, "getBytes(...)");
        return bytes;
    }

    public final double getPdr_accuracy_x() {
        return this.pdr_accuracy_x;
    }

    public final double getPdr_accuracy_y() {
        return this.pdr_accuracy_y;
    }

    public final double getPdr_class() {
        return this.pdr_class;
    }

    public final boolean getPostFirstLock() {
        return this.postFirstLock;
    }

    public final double getQ0() {
        return this.q0;
    }

    public final double getQ1() {
        return this.q1;
    }

    public final double getQ2() {
        return this.q2;
    }

    public final double getQ3() {
        return this.q3;
    }

    @Nullable
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @Override // me.oriient.internal.services.uploadingManager.models.UploadableSample
    public long getStartTimeMillis() {
        return this.timestampMillis - this.timeSinceLastUpdateMillis;
    }

    public final boolean getStrictMode() {
        return this.strictMode;
    }

    @NotNull
    public final String getT() {
        return this.t;
    }

    public final double getTd() {
        return this.td;
    }

    public final long getTimeSinceLastUpdateMillis() {
        return this.timeSinceLastUpdateMillis;
    }

    public final double getTime_diff() {
        return this.time_diff;
    }

    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public final double getU() {
        return this.u;
    }

    public final float getUser_accuracy() {
        return this.user_accuracy;
    }

    public final double getVelocity() {
        return this.velocity;
    }

    public final double getX() {
        return this.x;
    }

    public final double getXFreePath() {
        return this.xFreePath;
    }

    public final double getY() {
        return this.y;
    }

    public final double getYFreePath() {
        return this.yFreePath;
    }

    public int hashCode() {
        int iA = v.a(this.q3, v.a(this.q2, v.a(this.q1, v.a(this.q0, v.a(this.a0, v.a(this.calibError, v.a(this.td, v.a(this.u, v.a(this.mz, v.a(this.my, v.a(this.mx, v.a(this.y, Double.hashCode(this.x) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Double d = this.mapVersion;
        int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.mapId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.floorId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.f;
        int iA2 = x.a(this.strictMode, x.a(this.is_smart_cart, z.a(this.buildingId, android.support.v4.media.session.a.b(this.user_accuracy, v.a(this.os_lctn_alt, v.a(this.os_lctn_lon, v.a(this.os_lctn_lat, v.a(this.barometer, v.a(this.time_diff, v.a(this.background_ratio, v.a(this.application_state, w.a(this.timeSinceLastUpdateMillis, w.a(this.timestampMillis, v.a(this.elapsedTime, x.a(this.postFirstLock, v.a(this.lockProgress, x.a(this.calibNeeded, v.a(this.velocity, v.a(this.yFreePath, v.a(this.xFreePath, v.a(this.dMz, v.a(this.dMy, v.a(this.dMx, v.a(this.osLctnVU, v.a(this.osLctnHU, v.a(this.osLctnZ, v.a(this.osLctnY, v.a(this.osLctnX, z.a(this.osType, z.a(this.sessionId, z.a(this.engineVersion, z.a(this.deviceType, z.a(this.deviceId, z.a(this.t, (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        String str3 = this.restrictedAreaId;
        return Double.hashCode(this.pdr_accuracy_y) + v.a(this.pdr_accuracy_x, v.a(this.pdr_class, x.a(this.isSilentMode, (iA2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31), 31);
    }

    public final boolean isSilentMode() {
        return this.isSilentMode;
    }

    public final boolean is_smart_cart() {
        return this.is_smart_cart;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ValidationUpdate(x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append(", mx=");
        sb.append(this.mx);
        sb.append(", my=");
        sb.append(this.my);
        sb.append(", mz=");
        sb.append(this.mz);
        sb.append(", u=");
        sb.append(this.u);
        sb.append(", td=");
        sb.append(this.td);
        sb.append(", calibError=");
        sb.append(this.calibError);
        sb.append(", a0=");
        sb.append(this.a0);
        sb.append(", q0=");
        sb.append(this.q0);
        sb.append(", q1=");
        sb.append(this.q1);
        sb.append(", q2=");
        sb.append(this.q2);
        sb.append(", q3=");
        sb.append(this.q3);
        sb.append(", mapVersion=");
        sb.append(this.mapVersion);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", floorId=");
        sb.append(this.floorId);
        sb.append(", f=");
        sb.append(this.f);
        sb.append(", t=");
        sb.append(this.t);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", engineVersion=");
        sb.append(this.engineVersion);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", osType=");
        sb.append(this.osType);
        sb.append(", osLctnX=");
        sb.append(this.osLctnX);
        sb.append(", osLctnY=");
        sb.append(this.osLctnY);
        sb.append(", osLctnZ=");
        sb.append(this.osLctnZ);
        sb.append(", osLctnHU=");
        sb.append(this.osLctnHU);
        sb.append(", osLctnVU=");
        sb.append(this.osLctnVU);
        sb.append(", dMx=");
        sb.append(this.dMx);
        sb.append(", dMy=");
        sb.append(this.dMy);
        sb.append(", dMz=");
        sb.append(this.dMz);
        sb.append(", xFreePath=");
        sb.append(this.xFreePath);
        sb.append(", yFreePath=");
        sb.append(this.yFreePath);
        sb.append(", velocity=");
        sb.append(this.velocity);
        sb.append(", calibNeeded=");
        sb.append(this.calibNeeded);
        sb.append(", lockProgress=");
        sb.append(this.lockProgress);
        sb.append(", postFirstLock=");
        sb.append(this.postFirstLock);
        sb.append(", elapsedTime=");
        sb.append(this.elapsedTime);
        sb.append(", timestampMillis=");
        sb.append(this.timestampMillis);
        sb.append(", timeSinceLastUpdateMillis=");
        sb.append(this.timeSinceLastUpdateMillis);
        sb.append(", application_state=");
        sb.append(this.application_state);
        sb.append(", background_ratio=");
        sb.append(this.background_ratio);
        sb.append(", time_diff=");
        sb.append(this.time_diff);
        sb.append(", barometer=");
        sb.append(this.barometer);
        sb.append(", os_lctn_lat=");
        sb.append(this.os_lctn_lat);
        sb.append(", os_lctn_lon=");
        sb.append(this.os_lctn_lon);
        sb.append(", os_lctn_alt=");
        sb.append(this.os_lctn_alt);
        sb.append(", user_accuracy=");
        sb.append(this.user_accuracy);
        sb.append(", buildingId=");
        sb.append(this.buildingId);
        sb.append(", is_smart_cart=");
        sb.append(this.is_smart_cart);
        sb.append(", strictMode=");
        sb.append(this.strictMode);
        sb.append(", restrictedAreaId=");
        sb.append(this.restrictedAreaId);
        sb.append(", isSilentMode=");
        sb.append(this.isSilentMode);
        sb.append(", pdr_class=");
        sb.append(this.pdr_class);
        sb.append(", pdr_accuracy_x=");
        sb.append(this.pdr_accuracy_x);
        sb.append(", pdr_accuracy_y=");
        return androidx.camera.core.impl.b.p(sb, this.pdr_accuracy_y, ')');
    }
}
