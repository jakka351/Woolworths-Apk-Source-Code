package com.behaviosec.rl.android;

import com.behaviosec.rl.odooooo;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yyyllll;

/* loaded from: classes4.dex */
public class FlutterJavaInterfaceException extends Exception {
    private final ErrorCode xxxxx0078x;

    public enum ErrorCode {
        ENTRY_EXISTS_FOR_ID(uuxuuuu.pp0070p0070ppp("xV\u0005;kB$`\nDm\u0006^U\u0018C\t\u000f/dGIc\rMp\u0014.UE'K", (char) (yyyllll.rrrr007200720072() ^ 383822048), (char) (ylyylll.r0072rrr00720072() ^ (-1691741254)), (char) (yllylll.r007200720072r00720072() ^ (-1146716791))));

        private final String x0078xxx0078x;

        static {
            int iHhh00680068hhh = hhh00680068hhh();
            int iHh006800680068hhh = ((hh006800680068hhh() + iHhh00680068hhh) * iHhh00680068hhh) % h0068006800680068hhh();
        }

        ErrorCode(String str) {
            this.x0078xxx0078x = str;
        }

        public static int h0068006800680068hhh() {
            return 2;
        }

        public static int h0068h00680068hhh() {
            return 0;
        }

        public static int hh006800680068hhh() {
            return 1;
        }

        public static int hhh00680068hhh() {
            return 40;
        }

        public static ErrorCode valueOf(String str) throws Exception {
            Enum enumJ006Ajjj006A006A = odooooo.j006Ajjj006A006A(ErrorCode.class, str);
            int iHhh00680068hhh = (hhh00680068hhh() * (hh006800680068hhh() + hhh00680068hhh())) % h0068006800680068hhh();
            h0068h00680068hhh();
            return (ErrorCode) enumJ006Ajjj006A006A;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static ErrorCode[] valuesCustom() {
            ErrorCode[] errorCodeArr = (ErrorCode[]) values().clone();
            int iHhh00680068hhh = (hhh00680068hhh() * (hh006800680068hhh() + hhh00680068hhh())) % h0068006800680068hhh();
            h0068h00680068hhh();
            return errorCodeArr;
        }

        public String getMessage() {
            int iHhh00680068hhh = (hhh00680068hhh() * (hh006800680068hhh() + hhh00680068hhh())) % h0068006800680068hhh();
            h0068h00680068hhh();
            return this.x0078xxx0078x;
        }
    }

    public FlutterJavaInterfaceException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.xxxxx0078x = errorCode;
    }

    public static int h00680068h0068hhh() {
        return 2;
    }

    public static int h0068hh0068hhh() {
        return 0;
    }

    public static int hh0068h0068hhh() {
        return 1;
    }

    public static int hhhh0068hhh() {
        return 73;
    }

    public ErrorCode getErrorCode() {
        int iHhhh0068hhh = (hhhh0068hhh() * (hh0068h0068hhh() + hhhh0068hhh())) % h00680068h0068hhh();
        h0068hh0068hhh();
        return this.xxxxx0078x;
    }

    public FlutterJavaInterfaceException(ErrorCode errorCode, Throwable th) {
        super(errorCode.getMessage(), th);
        this.xxxxx0078x = errorCode;
    }
}
