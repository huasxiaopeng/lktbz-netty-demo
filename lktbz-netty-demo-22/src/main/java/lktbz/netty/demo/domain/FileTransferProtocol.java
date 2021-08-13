package lktbz.netty.demo.domain;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/13
 * @desc 文件传输协议
 */
public class FileTransferProtocol {
    private Integer transferType; //0请求传输文件、1文件传输指令、2文件传输数据
    private Object transferObj;   //数据对象；(0)FileDescInfo、(1)FileBurstInstruct、(2)FileBurstData

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public Object getTransferObj() {
        return transferObj;
    }

    public void setTransferObj(Object transferObj) {
        this.transferObj = transferObj;
    }
}
