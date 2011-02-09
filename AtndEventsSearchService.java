package net.sue445.api.atnd.service;

import net.sue445.api.atnd.dto.AtndEventsSearchRequestDto;
import net.sue445.api.atnd.dto.AtndEventsSearchResponseDto;

/**
 * ATNDイベントサーチSearvice
 * @author sue445
 * @see http://api.atnd.org/#events
 *
 */
public interface AtndEventsSearchService {

	/**
	 * 検索を実行する
	 * @param request	検索条件
	 * @return			検索結果
	 */
	public abstract AtndEventsSearchResponseDto execute(AtndEventsSearchRequestDto request);

}