import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import Network.IncomingRequestHandlerErrorTests;
import Network.RequestHandlerTests;
import Network.SocketServerTests;
import Network.Readers.ChannelReaderTests;
import Network.Readers.ChunkedReaderTests;
import Network.Readers.GzipReaderTests;
import Pipeline.Configuration.PipelineBuilderTests;
import Pipeline.Configuration.PipelineConfigurationTests;
import Protocol.Builders.RequestBuilderTests;
import Protocol.Builders.ResponseBuilderTests;
import Protocol.Models.ContentTypeTests;
import Protocol.Models.ContextTests;
import Protocol.Models.HeaderTests;
import Protocol.Models.HeadersTests;
import Protocol.Models.HttpRequestTests;
import Protocol.Models.HttpStatusTests;
import Protocol.Parsers.ParserTests;
import Protocol.Processing.EncodingReadersTests;
import Protocol.Processing.PipelineModuleTests;
import Protocol.Processing.RequestContextTests;
import Protocol.Processing.RequestMarshallerTests;
import Protocol.Processing.RequestProcessorTests;
import Protocol.Processing.ResponderTests;
import Protocol.Processing.TransferEncodingProcessorTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	IncomingRequestHandlerErrorTests.class,
	ChannelReaderTests.class,
	ChunkedReaderTests.class,
	GzipReaderTests.class,
	IncomingRequestHandlerErrorTests.class,
	RequestHandlerTests.class,
	SocketServerTests.class,
	PipelineBuilderTests.class,
	PipelineConfigurationTests.class,
	RequestBuilderTests.class,
	ResponseBuilderTests.class,
	ContentTypeTests.class,
	ContextTests.class,
	HeadersTests.class,
	HeaderTests.class,
	HttpRequestTests.class,
	HttpStatusTests.class,
	ParserTests.class,
	EncodingReadersTests.class,
	PipelineModuleTests.class,
	RequestContextTests.class,
	RequestMarshallerTests.class,
	RequestProcessorTests.class,
	ResponderTests.class,
	TransferEncodingProcessorTests.class	

})

public class AllJowiTest {

}
