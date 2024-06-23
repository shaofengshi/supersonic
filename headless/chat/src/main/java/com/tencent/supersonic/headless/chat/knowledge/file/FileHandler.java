package com.tencent.supersonic.headless.chat.knowledge.file;

import com.github.pagehelper.PageInfo;
import com.tencent.supersonic.headless.api.pojo.request.DictValueReq;
import com.tencent.supersonic.headless.api.pojo.response.DictValueResp;

import java.util.List;

public interface FileHandler {

    /**
     * backup files to a specific directory
     * config: dict.directory.backup
     *
     * @param fileName
     */
    void backupFile(String fileName);

    /**
     * create a directory
     *
     * @param path
     */
    void createDir(String path);

    Boolean existPath(String path);

    /**
     * write data to a specific file,
     * config dir: dict.directory.latest
     *
     * @param data
     * @param fileName
     * @param append
     */
    void writeFile(List<String> data, String fileName, Boolean append);

    /**
     * get the knowledge file root directory
     *
     * @return
     */
    String getDictRootPath();

    /**
     * delete dictionary file
     * automatic backup
     *
     * @param fileName
     * @return
     */
    Boolean deleteDictFile(String fileName);

    /**
     * delete files directly without backup
     *
     * @param fileName
     */
    void deleteFile(String fileName);

    PageInfo<DictValueResp> queryDictValue(String fileName, DictValueReq dictValueReq);

    String queryDictFilePath(String fileName);
}
